private java.io.File getAndroidBeginnerImageFile() {
    java.io.File mediaStorageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    return new java.io.File(mediaStorageDir.getPath(), "androidBeginnerImage.jpg");
}