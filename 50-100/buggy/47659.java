public void onAudioFocusChange(int focusChange) {
    if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT)) {
        mPlayTimer.stop();
        mMediaPlayer.pause();
    }else
        if (focusChange == (android.media.AudioManager.AUDIOFOCUS_GAIN)) {
        }else
            if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS)) {
                mAudioManager.abandonAudioFocus(this);
                mHasAudioFocus = false;
                mPlayTimer.stop();
                mMediaPlayer.pause();
                mContext.unregisterReceiver(mNoisyAudioStreamReceiver);
            }
        
    
    mContext.updateSongView();
}