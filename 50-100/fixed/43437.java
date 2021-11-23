@java.lang.Override
public void run() {
    long millis = (java.lang.System.currentTimeMillis()) - (startTime);
    int seconds = ((int) (millis / 1000));
    int minutes = seconds / 60;
    seconds = seconds % 60;
    timerTextView.setText(java.lang.String.format("%d:%02d", minutes, seconds));
    timerHandler.postDelayed(this, 0);
}