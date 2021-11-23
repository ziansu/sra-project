private boolean isThreeOfAKind() {
    java.util.ArrayList<com.company.Rank> cards = new java.util.ArrayList<>();
    for (com.company.Card c : hand.getHand()) {
        int i = 0;
        cards.add(c.getRank());
        int frequency = java.util.Collections.frequency(cards, cards.get(i));
        i++;
        if (frequency == 3) {
            return true;
        }
    }
    return false;
}