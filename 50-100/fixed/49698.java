public void onWaveButton(javafx.event.ActionEvent actionEvent) {
    if (((this.paused) == false) && ((peacePhase) == true)) {
        (this.wave)++;
        this.numEnemy = 0;
        this.enemyLimit = (2 * (this.wave)) + 1;
        this.waveLabel.setText(java.lang.String.format("Wave: %d", this.wave));
        this.startTimer();
        peacePhase = false;
    }
}