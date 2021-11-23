void onSetImageUriAsyncComplete(com.theartofdev.edmodo.cropper.BitmapLoadingWorkerTask.Result result) {
    mBitmapLoadingWorkerTask = null;
    setProgressBarVisibility();
    if ((result.error) == null) {
        setBitmap(result.bitmap, true);
        mLoadedImageUri = result.uri;
        mLoadedSampleSize = result.loadSampleSize;
        mDegreesRotated = result.degreesRotated;
    }
    com.theartofdev.edmodo.cropper.CropImageView.OnSetImageUriCompleteListener listener = ((mOnSetImageUriCompleteListener) != null) ? mOnSetImageUriCompleteListener.get() : null;
    if (listener != null) {
        listener.onSetImageUriComplete(this, result.uri, result.error);
    }
}