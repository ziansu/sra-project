@java.lang.Override
public void onStatusUpdated() {
    timber.log.Timber.d("VideoDetailsFragment : onProgressChanged() : onStatusUpdated()");
    if (isRemoteVideoPlaying()) {
        playbackState = com.etiennelawlor.loop.fragments.VideoDetailsFragment.PlaybackState.PLAYING;
        resumeLocalVideo();
        castInfoTextView.setText(java.lang.String.format("Casting to %s", castSession.getCastDevice().getFriendlyName()));
    }else {
        pauseLocalVideo();
        if ((playbackState) == (com.etiennelawlor.loop.fragments.VideoDetailsFragment.PlaybackState.PLAYING)) {
            if (isResumed())
                castInfoTextView.setText(getString(R.string.cast_is_loading));
            
        }
    }
    if (isResumed())
        castInfoTextView.setVisibility(View.VISIBLE);
    
}