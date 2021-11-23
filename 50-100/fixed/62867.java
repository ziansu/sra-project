private void getImagesFromStorage() {
    java.io.File mediaStorageDir = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Pannenhilfe");
    java.io.File[] test = mediaStorageDir.listFiles();
    if (test != null) {
        imageIDs = new java.lang.String[test.length];
        for (int i = 0; i < (test.length); i++) {
            imageIDs[i] = test[i].getPath();
        }
    }else {
        imageIDs = new java.lang.String[0];
    }
}