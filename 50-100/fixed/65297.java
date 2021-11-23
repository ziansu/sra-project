public void run() {
    while ((gameStatus) == (GameStatus.RUNNING)) {
        javafx.application.Platform.runLater(() -> {
            colony.update();
        });
        javafx.application.Platform.runLater(() -> {
            Controllers.bottomViewController.updateTimer(util.Timer.getElapsedTime());
        });
        try {
            java.lang.Thread.sleep(Settings.UPDATE_DELAY);
        } catch (java.lang.InterruptedException e) {
        }
    } 
    if ((gameStatus) == (GameStatus.ENDED)) {
    }
}