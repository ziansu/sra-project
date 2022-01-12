private void takePicture() {
    android.content.Intent takePictureIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    java.io.File f = null;
    try {
        f = createImageFile();
        mImageFilePath = f.getAbsolutePath();
        takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, android.net.Uri.fromFile(f));
    } catch (java.io.IOException e) {
        android.util.Log.d(com.kshitij.android.clickme.ui.PhotoFeedActivity.TAG, ("takeCapture(), Exception: " + (e.toString())));
    }
    startActivityForResult(takePictureIntent, Constants.ACTION_CAPTURE_PHOTO);
}