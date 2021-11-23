public static void main(java.lang.String[] args) {
    Deck deck = new Deck(12);
    java.lang.System.out.println(deck);
    Card drawn = deck.draw();
    java.lang.System.out.println(drawn);
    java.lang.System.out.println(deck);
}