@java.lang.Override
public void run() {
    int hours = (seconds) / 3600;
    int minutes = ((seconds) % 3600) / 60;
    int secs = (seconds) % 60;
    java.lang.String time = java.lang.String.format("%d:%02d:%02d", hours, minutes, secs);
    timeView.setText(time);
    if (running) {
        (seconds)++;
    }
    handler.postDelayed(this, 1000);
}