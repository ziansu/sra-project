protected boolean updateVideoSize(int width, int height) {
    matrixManager.setIntrinsicVideoSize(width, height);
    updateMatrixOnLayout();
    videoSize.x = width;
    videoSize.y = height;
    if ((width == 0) || (height == 0)) {
        return false;
    }
    android.view.SurfaceHolder holder = getHolder();
    if (holder != null) {
        holder.setFixedSize(width, height);
    }
    return true;
}