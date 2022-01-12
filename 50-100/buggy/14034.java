public void onPauseButton(javafx.event.ActionEvent actionEvent) {
    if (((this.paused) == false) && ((this.peacePhase) == false)) {
        this.timer.cancel();
        this.paused = true;
    }else {
        this.startTimer();
        this.paused = false;
    }
}