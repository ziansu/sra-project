private void dispatchTakePictureIntent(int actionCode) {
    android.content.Intent takePictureIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    java.io.File f = null;
    try {
        f = setupPhotoFile();
        mCurrentPhotoPath = f.getAbsolutePath();
        takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, android.net.Uri.fromFile(f));
    } catch (java.io.IOException e) {
        e.printStackTrace();
        f = null;
        mCurrentPhotoPath = null;
        return ;
    }
    startActivityForResult(takePictureIntent, actionCode);
}