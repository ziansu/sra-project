public android.graphics.Bitmap getMask(int x, int y) {
    android.graphics.Bitmap result = android.graphics.Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
    if ((((x < 0) || (x > (width))) || (y < 0)) || (y > (height))) {
        return result;
    }
    native_mask(nativeInstance, result, x, y);
    return result;
}