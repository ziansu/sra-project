@java.lang.Override
public void gameOver() {
    spawner.setToKill(true);
    engine.setToKill(true);
    gameCanvas.removeKeyListener(controller);
    gameCanvas.stop();
    bgmPlayer.stop();
    try {
        java.lang.Thread.sleep(1);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    gameFrame.dispose();
    menuFrame.setEnabled(true);
    menuFrame.toFront();
    menuFrame.repaint();
    engine.getScoreCalculator().convalidateScore();
}