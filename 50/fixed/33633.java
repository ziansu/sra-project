private void cancelTimer() {
    if ((this.countDownTimer) != null) {
        this.countDownTimer.cancel();
    }
    this.timerIsStarted = false;
    this.timeRemainingMilliseconds = this.getCurrentExercise().getDurationMilliseconds();
}