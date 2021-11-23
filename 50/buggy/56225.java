public void PlayGame() {
    DivideCardsOnStart();
    currentPlayerTurn = 0;
    if ((currentPlayerTurn) == 0) {
        java.lang.System.out.println("Player Turn!");
        java.lang.System.out.println(("userCardsLeft: " + (userCardsLeft)));
    }
    DrawComputerCards();
}