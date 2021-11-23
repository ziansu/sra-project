void setTextClockTime(android.widget.TextView txtClk, java.util.Calendar cal) {
    txtClk.setText(getTimeAsString(cal));
    android.util.Log.d("ABCABC", getTimeAsString(cal));
    android.widget.Toast.makeText(this.getApplicationContext(), getTimeAsString(cal), Toast.LENGTH_LONG).show();
}