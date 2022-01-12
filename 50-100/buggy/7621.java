private void saveToInternalStorage(android.graphics.Bitmap bitmapImage, java.lang.String filename) {
    android.content.ContextWrapper cw = new android.content.ContextWrapper(getApplicationContext());
    java.io.File directory = cw.getFilesDir();
    android.util.Log.e(rocks.athrow.android_inventory_app.ItemDetailDataEntry.LOG_TAG, ("nameField " + directory));
    java.io.File mypath = new java.io.File(directory, filename);
    java.io.FileOutputStream fos;
    try {
        fos = new java.io.FileOutputStream(mypath);
        bitmapImage.compress(Bitmap.CompressFormat.PNG, 100, fos);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}