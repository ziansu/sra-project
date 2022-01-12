@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((getDuration()) > 1) {
        int time = ((seekBar.getProgress()) * (getDuration())) / (progressMax);
        seekTo(time);
    }
    startProgressTimer();
    if ((currentState) == (STATE_PLAYING))
        startDismissControlViewTimer(1314);
    
}