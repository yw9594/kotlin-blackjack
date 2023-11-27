package blackjack.domain.model

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CardTest : FunSpec({
    test("카드 이름 정상 반환 테스트") {
        val card = Card(CardNumber.ACE, CardShape.Spade)
        val answer = "A스페이드"

        card.toString() shouldBe answer
    }
})