private void onApplicationDisconnected() {
    castSession = null;
    timber.log.Timber.d("VideoDetailsFragment : onApplicationDisconnected()");
    location = com.etiennelawlor.loop.fragments.VideoDetailsFragment.PlaybackLocation.LOCAL;
    thumbnailImageView.animate().alpha(0.0F).setDuration(1000);
    castInfoTextView.setVisibility(View.GONE);
    updateLocalVideoVolume(1.0F);
}