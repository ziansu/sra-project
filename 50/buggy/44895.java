@java.lang.Override
public void onClick(android.view.View v) {
    if (((org.gtlp.yasb.SoundActivity.soundPlayerInstance) != null) && (org.gtlp.yasb.SoundActivity.soundPlayerInstance.isPlaying())) {
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.pause();
    }
}