private void pauseLocalVideo() {
    timber.log.Timber.d("VideoDetailsFragment : pauseLocalVideo()");
    exoPlayer.setPlayWhenReady(false);
}