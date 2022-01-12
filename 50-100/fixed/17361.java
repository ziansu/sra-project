void onSetImageUriAsyncComplete(com.theartofdev.edmodo.cropper.BitmapLoadingWorkerTask.Result result) {
    mBitmapLoadingWorkerTask = null;
    setProgressBarVisibility();
    if ((result.error) == null) {
        setBitmap(result.bitmap, true);
        mLoadedImageUri = result.uri;
        mLoadedSampleSize = result.loadSampleSize;
        mDegreesRotated = result.degreesRotated;
    }
    if ((mOnSetImageUriCompleteListener) != null) {
        mOnSetImageUriCompleteListener.onSetImageUriComplete(this, result.uri, result.error);
    }
}