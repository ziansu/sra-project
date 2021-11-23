private void loadVideo(java.lang.String url) {
    progressBar.setVisibility(com.liferay.mobile.screens.viewsets.defaultviews.dlfile.display.VISIBLE);
    videoView.setVideoPath(url);
    videoView.setMediaController(new android.widget.MediaController(getContext()));
    videoView.setZOrderOnTop(true);
    videoView.requestFocus();
    videoView.start();
}