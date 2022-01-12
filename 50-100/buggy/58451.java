public static void playGame() {
    Engine.printBoard();
    Engine.printHand();
    while ((Engine.handIsOver()) == false) {
        Engine.playerAction();
        Engine.computerAction();
        Engine.dealerAction();
        Engine.printBoard();
        Engine.printHand();
    } 
    Engine.printBoard();
    Engine.determineWinners();
    Engine.splitWinnings();
    Engine.askForNewRound();
}