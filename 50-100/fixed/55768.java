private void setUpVideoPlayback(boolean isSubtitleEnabled) {
    org.videolan.libvlc.Media media = new org.videolan.libvlc.Media(mLibVLC, getVideoUri());
    mMediaPlayer.setMedia(media);
    media.release();
    if (isSubtitleEnabled) {
        searchSubtitleFile();
    }
    mMediaPlayer.play();
}