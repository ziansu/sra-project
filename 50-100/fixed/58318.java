private java.io.File createImageFile() throws java.io.IOException {
    java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
    java.lang.String imageFileName = ("JPEG_" + timeStamp) + "_";
    java.io.File storageDir = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    android.util.Log.d("MainActivity", "GotHere");
    java.io.File image = java.io.File.createTempFile(imageFileName, ".jpg", storageDir);
    mCurrentPhotoPath = image.getAbsolutePath();
    return image;
}