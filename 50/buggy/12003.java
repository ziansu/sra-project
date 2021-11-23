@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean fromUser) {
    if (fromUser)
        jcAudioPlayer.seekTo(i);
    
}