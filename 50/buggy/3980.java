@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    if ((org.gtlp.yasb.SoundActivity.soundPlayerInstance) != null) {
        oldState = org.gtlp.yasb.SoundActivity.soundPlayerInstance.isPlaying();
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.pause();
    }
}