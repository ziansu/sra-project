private android.graphics.Bitmap loadImageFromFile(java.lang.String imageFileName) {
    android.graphics.Bitmap bitmap = null;
    try {
        java.io.File dir = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        java.io.File imageFile = new java.io.File(dir, imageFileName);
        java.io.InputStream inputStream = new java.io.FileInputStream(imageFile);
        bitmap = android.graphics.BitmapFactory.decodeStream(inputStream);
        android.util.Log.d("tag", ("got image from cache: " + imageFileName));
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return bitmap;
}