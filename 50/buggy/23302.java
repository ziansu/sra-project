void setTextClockTimeFromString(android.widget.TextView txtClk, java.lang.String timeDisplay) {
    txtClk.setText(timeDisplay);
    android.util.Log.d("ABCABC", timeDisplay);
    android.widget.Toast.makeText(this.getApplicationContext(), timeDisplay, Toast.LENGTH_LONG);
}