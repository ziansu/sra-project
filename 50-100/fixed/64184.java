public void printCards() {
    for (int x = 0; x < (deck.size()); x++) {
        java.lang.System.out.println((((deck.get(x).getRank()) + " of ") + (deck.get(x).getSuit())));
    }
}