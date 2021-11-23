private java.io.File createImageFile() {
    java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss", java.util.Locale.US).format(new java.util.Date());
    java.lang.String imageFileName = ("PNG_" + timeStamp) + "_";
    java.io.File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    java.io.File image = null;
    try {
        image = java.io.File.createTempFile(imageFileName, ".png", storageDir);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    mCurrentPhotoPath = image.getAbsolutePath();
    return image;
}