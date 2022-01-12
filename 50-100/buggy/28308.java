public static java.io.File createImageFile() throws java.io.IOException {
    final java.lang.String dir = (android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)) + "/shk/";
    java.io.File storageDir = new java.io.File(dir);
    storageDir.mkdirs();
    java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
    java.lang.String imageFileName = timeStamp + "_";
    java.io.File image = java.io.File.createTempFile(imageFileName, ".jpg", storageDir);
    return image;
}