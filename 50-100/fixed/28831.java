public void changeSetScore(softeng.myapp.player playerA, softeng.myapp.player playerB) {
    int scoreA = playerA.getSet();
    int scoreB = playerB.getSet();
    playerA.setSet();
    if (((scoreA - scoreB) >= 1) && (scoreA >= ((NUM_GAMES) - 1))) {
        finishMatch(playerA);
    }
}