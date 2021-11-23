public void showImageSelector() {
    if (mImageSelector.equalsIgnoreCase(getString(R.string.gallery))) {
        startGalleryPicker();
        return ;
    }
    if (mImageSelector.equalsIgnoreCase(getString(R.string.camera))) {
        startCamera();
    }
    android.util.Log.w(wwckl.projectmiki.activity.MainActivity.LOG_TAG, "Image selector value does not match any path");
}