@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    command &= 199;
    command |= progress << 3;
    sendCommand();
    receiveAndUpdateStatus();
}