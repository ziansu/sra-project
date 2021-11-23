private void getImagesFromStorage() {
    java.io.File mediaStorageDir = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Pannenhilfe");
    java.io.File[] test = mediaStorageDir.listFiles();
    imageIDs = new java.lang.String[test.length];
    for (int i = 0; i < (test.length); i++) {
        android.util.Log.w("BLAAAAAAAAAAAA", test[i].getName());
        imageIDs[i] = test[i].getPath();
    }
}