public void onAudioFocusChange(int focusChange) {
    if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT)) {
        mPlayTimer.stop();
        mMediaPlayer.pause();
        unregisterAudio();
    }else
        if (focusChange == (android.media.AudioManager.AUDIOFOCUS_GAIN)) {
        }else
            if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS)) {
                mAudioManager.abandonAudioFocus(this);
                mPlayTimer.stop();
                mMediaPlayer.pause();
                unregisterAudio();
            }
        
    
    mContext.updateSongView();
}