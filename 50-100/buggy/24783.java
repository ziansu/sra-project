private void playLocalVideo(long position, boolean autoPlay) {
    timber.log.Timber.d("VideoDetailsFragment : playLocalVideo()");
    if ((location) == (com.etiennelawlor.loop.fragments.VideoDetailsFragment.PlaybackLocation.LOCAL)) {
        thumbnailImageView.animate().alpha(0.0F).setDuration(1000);
        castInfoTextView.setVisibility(View.GONE);
    }
    updateLocalVideoPosition(position);
    exoPlayer.prepare(getMediaSource(videoUrl));
    isLocalVideoPrepared = true;
    if (!autoPlay)
        pauseLocalVideo();
    
}