public void removeImageFromDevice(java.lang.String imageFileName) {
    java.lang.String localFileName = getLocalImageFileName(imageFileName);
    java.io.File dir = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    java.io.File fdelete = new java.io.File(((dir + "/") + localFileName));
    if (fdelete.exists()) {
        if (fdelete.delete()) {
        }
    }
}