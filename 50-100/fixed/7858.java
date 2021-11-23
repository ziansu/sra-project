public void setTime(int minutes, int seconds) {
    if (seconds < 0)
        seconds = 0;
    
    if (minutes < 0)
        minutes = 0;
    
    this.minutes = minutes + (seconds / 60);
    this.seconds = seconds % 60;
    this.setText(java.lang.String.format("%02d:%02d", this.minutes, this.seconds));
}