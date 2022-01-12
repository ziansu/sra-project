@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progressValue, boolean fromUser) {
    User = fromUser;
    progress = progressValue;
}