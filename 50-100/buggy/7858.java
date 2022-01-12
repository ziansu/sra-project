public void setTime(int minutes, int seconds) {
    this.minutes = minutes + (seconds / 60);
    this.seconds = seconds % 60;
    this.setText(java.lang.String.format("%02d:%02d", this.minutes, this.seconds));
}