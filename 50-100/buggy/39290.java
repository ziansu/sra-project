protected void onPostExecute(android.graphics.Bitmap imageToSave) {
    imageView.setImageBitmap(imageToSave);
    java.io.File file = new java.io.File(imageDir, imageName);
    try {
        java.io.FileOutputStream out = new java.io.FileOutputStream(file);
        imageToSave.compress(Bitmap.CompressFormat.JPEG, 100, out);
        out.flush();
        out.close();
    } catch (java.lang.Exception e) {
        android.util.Log.e(LOG_TAG, "Error writing the image file to sdcard");
        android.util.Log.e(LOG_TAG, e.getMessage());
    }
}