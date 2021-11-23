java.io.File createImageFile() throws java.io.IOException {
    java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
    java.lang.String fileName = "Image_" + timeStamp;
    java.io.File storageDirectory = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    java.io.File image = java.io.File.createTempFile(fileName, ".jpg", storageDirectory);
    com.kiit.viper.devoir.ProblemCapture.mImageFileLocation = image.getAbsolutePath();
    return image;
}