public void takePicture() {
    android.content.Intent takePictureIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    if ((takePictureIntent.resolveActivity(getPackageManager())) != null) {
        java.io.File photoFile = null;
        try {
            photoFile = createImageFile();
        } catch (java.io.IOException ex) {
            android.util.Log.e(edu.mobile.ravelryknit.Submit.TAG, "IO Exception while creating image file", ex);
        }
        if (photoFile != null) {
            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, android.net.Uri.fromFile(photoFile));
            startActivityForResult(takePictureIntent, edu.mobile.ravelryknit.Submit.REQUEST_IMAGE_CAPTURE);
        }
    }
}