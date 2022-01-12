public android.graphics.Bitmap decodeSampledBitmapFromRes(android.content.res.Resources resources, int resId, int reqWidth, int reqHeight) {
    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inJustDecodeBounds = true;
    android.graphics.BitmapFactory.decodeResource(resources, resId, options);
    int outWidth = options.outWidth;
    int outHeight = options.outHeight;
    options.inSampleSize = calSampleSize(outWidth, outHeight, reqWidth, reqHeight);
    options.inJustDecodeBounds = false;
    return android.graphics.BitmapFactory.decodeResource(resources, resId, options);
}