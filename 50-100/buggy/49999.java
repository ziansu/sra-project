public static boolean isStraight(ehunter.poker.hand.Hand h) {
    h.sortByValue();
    ehunter.poker.hand.Card[] cards = h.getCards();
    int testRank = (cards[0].getValue().getSortingValue()) + 1;
    for (ehunter.poker.hand.Card c : cards) {
        if ((c.getValue().getSortingValue()) != testRank) {
            return false;
        }
        testRank++;
    }
    return true;
}