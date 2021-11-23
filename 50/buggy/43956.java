private void initImageGetter() {
    mImageGetter = new com.heaven7.android.util2.ImageHelper(getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath(), this, new com.heaven7.android.util2.demo.sample.TestGetImageInN.ImageCallbackImpl()) {    };
}