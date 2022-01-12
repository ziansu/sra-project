public void gameOver() {
    java.lang.System.out.println("Game is finished.");
    theMenuModel.addScore(score);
    theGameView.dispose();
    if (timerThread.isAlive())
        timerThread.interrupt();
    
}