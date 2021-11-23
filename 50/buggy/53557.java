private java.io.File getAndroidBeginnerImageFile() {
    java.io.File mediaStorageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    java.io.File mediaFile = new java.io.File(mediaStorageDir.getPath(), "androidBeginnerImage.jpg");
    return mediaFile;
}