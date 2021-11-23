@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    mins = ((int) (progress)) / 60;
    secs = progress - ((mins) * 60);
    java.lang.String secondString = java.lang.Integer.toString(secs);
    if (secondString == "0") {
        secondString = "00";
    }
    timerTextView.setText((((java.lang.Integer.toString(mins)) + ":") + secondString));
    timerPref = progress;
}