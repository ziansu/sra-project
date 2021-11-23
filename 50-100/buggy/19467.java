private void attachMediaController() {
    if (((mMediaPlayer) != null) && ((mMediaController) != null)) {
        mMediaController.setMediaPlayer(this);
        android.view.View anchorView = ((this.getParent()) instanceof android.view.View) ? ((android.view.View) (this.getParent())) : this;
        mMediaController.setAnchorView(anchorView);
        mMediaController.setEnabled(isInPlaybackState());
    }
}