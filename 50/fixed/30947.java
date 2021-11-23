@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    weight = java.lang.Integer.parseInt(java.lang.String.valueOf(seekBar1.getProgress()));
}