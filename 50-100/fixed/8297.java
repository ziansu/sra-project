@java.lang.Override
public android.graphics.Bitmap transform(android.graphics.Bitmap source) {
    int y = (source.getHeight()) / 5;
    int x = 0;
    android.graphics.Bitmap result = android.graphics.Bitmap.createBitmap(source, x, y, source.getWidth(), (((source.getHeight()) * 3) / 5));
    if (result != source) {
        source.recycle();
    }
    return result;
}