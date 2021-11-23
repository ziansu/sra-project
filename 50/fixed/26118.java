@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((oldState) && ((org.gtlp.yasb.SoundActivity.soundPlayerInstance.get()) != null))
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().start();
    
}