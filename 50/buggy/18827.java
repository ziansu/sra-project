public void pauseAction() {
    if (mMediaPlayer.isPlaying()) {
        mMediaPlayer.pause();
        playState = PLAYSTATE.IS_PAUSE;
        org.greenrobot.eventbus.EventBus.getDefault().post(playState);
    }
}