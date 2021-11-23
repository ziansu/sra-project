protected boolean updateVideoSize(int width, int height) {
    matrixManager.setIntrinsicVideoSize(width, height);
    updateMatrixOnLayout();
    videoSize.x = width;
    videoSize.y = height;
    return (width != 0) && (height != 0);
}