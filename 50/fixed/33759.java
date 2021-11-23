private void releaseAftertakePicture() {
    if ((mImageVirtualDisplay) != null) {
        mImageVirtualDisplay.release();
        mImageVirtualDisplay = null;
    }
}