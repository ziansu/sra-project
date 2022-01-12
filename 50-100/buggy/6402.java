public android.graphics.Bitmap decodeSampledBitmapFromResource(android.content.res.Resources res, int resId, int reqWidth, int reqHeight) {
    final android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inJustDecodeBounds = true;
    android.graphics.BitmapFactory.decodeResource(res, resId, options);
    options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
    options.inJustDecodeBounds = false;
    options.inMutable = true;
    return android.graphics.BitmapFactory.decodeResource(res, resId, options);
}