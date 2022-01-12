@java.lang.Override
public void onClick(android.view.View v) {
    if (((org.gtlp.yasb.SoundActivity.soundPlayerInstance.get()) != null) && (!(org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().isPlaying()))) {
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().start();
    }
}