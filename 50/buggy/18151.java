public void setVideoSize(int width, int height) {
    mVideoWidth = width;
    mVideoHeight = height;
    mRendererScreen.setVideoSize(width, height);
}