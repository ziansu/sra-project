public void onAudioFocusChange(int focusChange) {
    if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS)) {
        pausePlayer();
    }else
        if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT)) {
            pausePlayer();
        }else
            if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK)) {
                currentTrackPlayer.setVolume(0.25F, 0.25F);
            }else
                if (focusChange == (android.media.AudioManager.AUDIOFOCUS_GAIN)) {
                    currentTrackPlayer.setVolume(1.0F, 1.0F);
                }
            
        
    
}