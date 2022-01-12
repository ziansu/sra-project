public void setVideoStartAt(int startAt) {
    videoStartAt = startAt * 1000;
    if ((mMediaPlayer) == null) {
        return ;
    }
    if ((mMediaPlayer.getDuration()) < (videoStartAt)) {
        mMediaPlayer.seekTo(videoStartAt);
    }
}