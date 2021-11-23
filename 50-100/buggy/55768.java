private void setUpVideoPlayback(boolean isSubtitleEnabled) {
    org.videolan.libvlc.Media media = new org.videolan.libvlc.Media(mLibVLC, getVideoUri());
    mMediaPlayer.setMedia(media);
    if (isSubtitleEnabled) {
        searchSubtitleFile();
    }
    media.release();
    mMediaPlayer.play();
}