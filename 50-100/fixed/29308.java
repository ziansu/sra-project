public static java.io.File getOutputMediaFile(android.content.Context context) {
    java.io.File mediaStorageDir = com.cs48.lethe.utils.FileUtilities.getFileDirectory(context);
    java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
    return new java.io.File((((((mediaStorageDir.getPath()) + (java.io.File.separator)) + "IMG_") + timeStamp) + ".jpg"));
}