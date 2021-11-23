@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    timer = progress;
    timerTextView.setText(java.lang.String.valueOf(timer));
}