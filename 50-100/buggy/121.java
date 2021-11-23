public void setVideoStartAt(int startAt) {
    videoStartAt = startAt;
    if ((mMediaPlayer) == null) {
        return ;
    }
    if (((mMediaPlayer.getDuration()) * 1000) < (videoStartAt)) {
        mMediaPlayer.seekTo(videoStartAt);
    }
}