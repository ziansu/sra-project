public void saveCurrentPosition() {
    if (((videoView) != null) && ((videoItemDetails) != null)) {
        videoItemDetails.detail.progress = videoView.getCurrentPosition();
    }
}