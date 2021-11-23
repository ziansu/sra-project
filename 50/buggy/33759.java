private void releaseAftertakePicture() {
    if ((mImageVirtualDisplay) != null) {
        mImageVirtualDisplay.release();
        mImageVirtualDisplay = null;
    }
    if ((mImageSurface) != null) {
        mImageSurface.release();
        mImageSurface = null;
    }
}