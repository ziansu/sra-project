private void startCamera() {
    android.content.Intent takePictureIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    java.io.File imageFile = com.cs48.lethe.utils.FileUtilities.saveImageFile(this);
    mImageUri = com.cs48.lethe.utils.FileUtilities.getImageUri(imageFile);
    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, mImageUri);
    if ((takePictureIntent.resolveActivity(getPackageManager())) != null) {
        startActivityForResult(takePictureIntent, com.cs48.lethe.ui.CameraActivity.IMAGE_CAPTURE_REQUEST);
    }
}