@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    if (b) {
        mediaPlayer.seekTo(i);
    }
}