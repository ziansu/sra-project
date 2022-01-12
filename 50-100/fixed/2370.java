private android.graphics.Bitmap getBitmapFromAsset(java.lang.String productId) {
    android.content.res.AssetManager assetManager = getAssets();
    java.io.InputStream stream;
    try {
        stream = assetManager.open((productId + ".png"));
        return android.graphics.BitmapFactory.decodeStream(stream);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return null;
    }
}