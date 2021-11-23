private void setBitmaps(java.lang.String filterPath) {
    java.io.File[] bitmaps = new java.io.File(filterPath).listFiles();
    mBitmaps = new java.util.ArrayList<android.graphics.Bitmap>();
    if (bitmaps != null) {
        for (java.io.File bitmap : bitmaps) {
            if (bitmap != null) {
                mBitmaps.add(android.graphics.BitmapFactory.decodeFile(bitmap.getAbsolutePath()));
            }
        }
    }
    notifyDataSetChanged();
}