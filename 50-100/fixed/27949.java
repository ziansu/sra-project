static void saveBitmapToFile(android.graphics.Bitmap imageBitmap) {
    java.io.FileOutputStream out = null;
    try {
        out = new java.io.FileOutputStream(al.ahgitdevelopment.municion.FragmentMainActivity.fileImagePath);
        imageBitmap.compress(Bitmap.CompressFormat.JPEG, 70, out);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (out != null) {
                out.close();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}