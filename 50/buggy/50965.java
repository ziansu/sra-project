private void resumeLocalVideo() {
    timber.log.Timber.d("VideoDetailsFragment : resumeLocalVideo()");
    exoPlayer.setPlayWhenReady(true);
}