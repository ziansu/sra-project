@java.lang.Override
public void handle(long now) {
    long lag = now - (prevUpdate);
    if (lag >= (reimaginedguacamole.gui.FXMLController.NANO_TICKS)) {
        if ((progress) > 0) {
            progress -= 0.003 / ((roundDuration) / 10);
        }else {
            progress = 0;
            animationTimer.stop();
            gameController.setCurrentAnswer(0);
            gameController.setGameState(reimaginedguacamole.gui.Answered);
        }
        pbRoundTimer.setProgress(progress);
        prevUpdate = now;
    }
}