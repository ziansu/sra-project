private boolean isThreeOfAKind() {
    java.util.ArrayList<com.company.Rank> cards = new java.util.ArrayList<>();
    int i = 0;
    for (com.company.Card c : hand.getHand()) {
        cards.add(c.getRank());
        int frequency = java.util.Collections.frequency(cards, cards.get(i));
        i++;
        if (frequency == 3) {
            return true;
        }
    }
    return false;
}