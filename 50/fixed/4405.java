@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    if (((mediaPlayer) != null) && b) {
        pauseLength = i;
        mediaPlayer.seekTo(i);
    }
}