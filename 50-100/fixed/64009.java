private void seekPosition(boolean left) {
    com.geniusgithub.mediarender.video.VideoActivity.log.e(((("onKey: seekPosition:" + (mSeekTime)) + " ") + (mPlayerEngineImpl.getDuration())));
    if (((mSeekTime) >= 0) && ((mSeekTime) <= (mPlayerEngineImpl.getDuration()))) {
        com.geniusgithub.mediarender.video.VideoActivity.log.e(("onKey: seekPosition:" + (mSeekTime)));
        onSeekCommand(mSeekTime);
    }
    play();
    mSeekTime = -1;
    mUIManager.showControlView(false);
}