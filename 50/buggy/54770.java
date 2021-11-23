@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser && ((org.gtlp.yasb.SoundActivity.soundPlayerInstance) != null))
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.seekTo(progress);
    
}