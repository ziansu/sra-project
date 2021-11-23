public void onAudioFocusChange(int focusChange) {
    if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT)) {
        mMediaPlayer.pause();
    }else
        if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS)) {
            mMediaPlayer.stop();
            releaseMediaPlayer();
            mAudioManager.abandonAudioFocus(afChangeListener);
        }else
            if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK)) {
                mMediaPlayer.pause();
            }else
                if (focusChange == (android.media.AudioManager.AUDIOFOCUS_GAIN)) {
                    releaseMediaPlayer();
                    mMediaPlayer.start();
                }
            
        
    
}