public void play(javafx.event.ActionEvent actionEvent) {
    if ((currentAttempt) == null) {
        restart(actionEvent);
    }else {
        playTimer();
    }
}