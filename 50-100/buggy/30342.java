private void storeImage(android.graphics.Bitmap image) {
    java.io.File pictureFile = com.example.arjun.nhacks.GroupHardActivity.getOutputMediaFile();
    java.io.FileOutputStream fos = null;
    if (pictureFile == null) {
        return ;
    }
    try {
        fos = new java.io.FileOutputStream(pictureFile);
        image.compress(Bitmap.CompressFormat.PNG, 90, fos);
        fos.close();
    } catch (java.io.FileNotFoundException e) {
    } catch (java.io.IOException e) {
    }
}