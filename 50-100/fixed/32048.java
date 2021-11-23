protected android.graphics.Bitmap decodeBitmapFromPath(java.lang.String path, int width, int height) {
    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inJustDecodeBounds = true;
    android.graphics.BitmapFactory.decodeFile(path, options);
    options.inSampleSize = caculateInSampleSize(options, width, height);
    options.inJustDecodeBounds = false;
    return android.graphics.BitmapFactory.decodeFile(path, options);
}