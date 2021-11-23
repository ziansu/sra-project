@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser && ((org.gtlp.yasb.SoundActivity.soundPlayerInstance.get()) != null))
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().seekTo(progress);
    
}