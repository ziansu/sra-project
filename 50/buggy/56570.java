public void gameOver() {
    java.lang.System.out.println("Game is finished.");
    theMenuModel.addScore(java.lang.Integer.toString(score));
    theGameView.dispose();
    if (timerThread.isAlive())
        timerThread.interrupt();
    
}