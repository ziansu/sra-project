public static android.graphics.Bitmap decodeSampledBitmapFromResource(android.content.res.Resources res, int resId, int reqWidth, int reqHeight, int samplerate) {
    final android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inJustDecodeBounds = true;
    android.graphics.BitmapFactory.decodeResource(res, resId, options);
    options.inSampleSize = samplerate;
    options.inJustDecodeBounds = false;
    return android.graphics.BitmapFactory.decodeResource(res, resId, options);
}