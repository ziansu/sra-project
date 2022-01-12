@java.lang.Override
public void onAudioFocusChange(int focusChange) {
    switch (focusChange) {
        case android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK :
            if ((mediaPlayer) != null)
                mediaPlayer.setVolume(0.2F, 0.2F);
            
            break;
        case android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT :
            pause(getCurrentAudio());
            break;
        case android.media.AudioManager.AUDIOFOCUS_LOSS :
            pause(getCurrentAudio());
            break;
        case android.media.AudioManager.AUDIOFOCUS_GAIN :
            if ((mediaPlayer) != null)
                mediaPlayer.setVolume(1.0F, 1.0F);
            
            play(getCurrentAudio());
            break;
    }
}