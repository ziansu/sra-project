@java.lang.Override
public void run() {
    (seconds)++;
    ((android.widget.TextView) (findViewById(R.id.passingTime))).setText(java.lang.String.valueOf(seconds));
    timerHandler.postDelayed(this, 1000);
}