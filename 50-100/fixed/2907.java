public static android.graphics.Bitmap blurNatively(android.graphics.Bitmap original, int radius, boolean canReuseInBitmap) {
    if (radius < 1) {
        return null;
    }
    android.graphics.Bitmap bitmap = net.qiujuer.genius.app.BlurKit.buildBitmap(original, canReuseInBitmap);
    if (radius == 1) {
        return bitmap;
    }
    net.qiujuer.genius.app.BlurNative.blurBitmap(bitmap, radius);
    return bitmap;
}