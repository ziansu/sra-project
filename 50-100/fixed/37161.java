public static void dealerTurn() {
    while ((game.Game.dHand.handValue()) < 17) {
        java.lang.System.out.println("Dealer will hit");
        game.Game.dealDealer();
        if (game.Game.pHitOrStand.equals("H")) {
            game.Game.playerTurn();
        }
    } 
    java.lang.System.out.println();
    java.lang.System.out.println("Dealer");
    java.lang.System.out.println(("Dealer Total: " + (game.Game.dHand.handValue())));
    java.lang.System.out.println("Dealer is staying \n");
    game.Game.dHitOrStand = "S";
}