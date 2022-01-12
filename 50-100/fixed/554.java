private java.io.File createImageFile() throws java.io.IOException {
    java.io.File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    java.io.File image = new java.io.File(storageDir, co.share.share.ItemCreateActivity.UPLOAD_FILE_NAME);
    if (image.exists()) {
        image.delete();
    }
    image.createNewFile();
    mCurrentImagePath = image.getAbsolutePath();
    return image;
}