public static void main(java.lang.String[] args) {
    CardPile deck = new CardPile();
    Pile pile1 = new Pile(1);
    Player player1 = new Player("Test");
    Computer comp1 = new Computer();
    deck.buildDeck();
    deck.shuffleDeck();
    deck.firstDeal(player1, comp1);
    player1.displayHand();
    java.lang.System.out.println();
    pile1.addCard(player1.playerHand[0]);
    pile1.displayPile();
}