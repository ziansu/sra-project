public void updateHandValue() {
    for (io.zipcoder.zealotscasino.Card card : getCards()) {
        handValue += evaluateCard(card);
    }
    for (io.zipcoder.zealotscasino.Card card : getCards()) {
        if (((extractCardOrdinal(card)) == 12) && ((handValue) > 21)) {
            handValue -= 10;
        }
    }
}