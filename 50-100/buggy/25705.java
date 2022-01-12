@java.lang.Override
public void onAudioFocusChange(int focusChange) {
    switch (focusChange) {
        case android.media.AudioManager.AUDIOFOCUS_GAIN :
            break;
        case android.media.AudioManager.AUDIOFOCUS_LOSS :
            mediaPlayer.release();
            break;
        case android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT :
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            }
            break;
        case android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK :
            if (mediaPlayer.isPlaying())
                mediaPlayer.setVolume(0.1F, 0.1F);
            
            break;
    }
}