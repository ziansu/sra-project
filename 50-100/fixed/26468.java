private int examineHandValue(io.zipcoder.zealotscasino.Hand hand) {
    int handValue = 0;
    for (io.zipcoder.zealotscasino.Card card : hand.getCards()) {
        if ((Card.CardValue.valueOf(card.getFaceValue()).ordinal()) == 14) {
            if (handValue > 7) {
                handValue++;
            }
        }
        handValue += (Card.CardValue.valueOf(card.getFaceValue()).ordinal()) + 2;
    }
    return handValue;
}