@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    service.seekTo((i * 1000));
    updateUI();
}