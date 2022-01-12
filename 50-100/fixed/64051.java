@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    secs = progress;
    if ((secs) == 0) {
        timerTextView.setText(((((java.lang.Integer.toString(mins)) + ":") + (java.lang.Integer.toString(secs))) + "0"));
    }else {
        timerTextView.setText((((java.lang.Integer.toString(mins)) + ":") + (java.lang.Integer.toString(secs))));
    }
}