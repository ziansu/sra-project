@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    java.lang.String data = "scorelimit;0;" + (java.lang.String.valueOf((((this.seekBar.getProgress()) + 1) * 9)));
    sendDataToServer(data, getPlayer(), delegate);
}