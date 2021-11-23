public void changeSetScore(softeng.myapp.player playerA, softeng.myapp.player playerB) {
    int scoreA = playerA.getSet();
    int scoreB = playerB.getSet();
    if (((scoreA >= 0) && (scoreA <= ((NUM_GAMES) - 2))) || ((scoreA - scoreB) == 0)) {
        playerA.setSet();
    }else
        if ((scoreA - scoreB) >= 1) {
            playerA.setSet();
            updateScreen();
            finishMatch(playerA);
        }
    
}