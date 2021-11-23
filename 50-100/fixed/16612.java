public void start() {
    java.lang.System.out.println("\nWelcome to the Table");
    java.lang.System.out.println("The card person is dealing the cards.");
    dealer.getDeck().shuffle();
    dealer.dealCards(dealer, player);
    player.reconcileValues();
    dealer.reconcileValues();
    gameLogic();
}