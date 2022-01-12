private java.io.File createImageFile() throws java.io.IOException {
    java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss", java.util.Locale.US).format(new java.util.Date());
    java.lang.String imageFileName = ("PNG_" + timeStamp) + "_";
    java.io.File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    java.io.File image = java.io.File.createTempFile(imageFileName, ".png", storageDir);
    mCurrentPhotoPath = image.getAbsolutePath();
    return image;
}