@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    command &= 248;
    command |= progress;
    sendCommand();
    receiveAndUpdateStatus();
}