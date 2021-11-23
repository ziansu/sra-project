public static java.io.File createImageFile(java.io.File storageDir) throws java.io.IOException {
    storageDir.mkdirs();
    java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
    java.lang.String imageFileName = timeStamp + "_";
    java.io.File image = java.io.File.createTempFile(imageFileName, ".jpg", storageDir);
    return image;
}