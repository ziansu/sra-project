@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    setClipPosition(seekBar.getProgress(), seekBar.getMax());
}