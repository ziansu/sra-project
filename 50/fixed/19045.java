public void playGame() {
    while ((hasChips()) && (userWantsToContinue())) {
        playHand();
    } 
}