@java.lang.Override
public void onStatusUpdated() {
    if (isResumed()) {
        if (isRemoteVideoPlaying()) {
            playbackState = com.etiennelawlor.loop.fragments.VideoDetailsFragment.PlaybackState.PLAYING;
            resumeLocalVideo();
            castInfoTextView.setText(java.lang.String.format("Casting to %s", castSession.getCastDevice().getFriendlyName()));
        }else {
            pauseLocalVideo();
            if ((playbackState) == (com.etiennelawlor.loop.fragments.VideoDetailsFragment.PlaybackState.PLAYING)) {
                castInfoTextView.setText(getString(R.string.cast_is_loading));
            }
        }
        castInfoTextView.setVisibility(View.VISIBLE);
    }
}