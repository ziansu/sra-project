public void drawCard(int position) {
    try {
        hand.addCard(deck.draw(position));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("No more cards");
    }
}