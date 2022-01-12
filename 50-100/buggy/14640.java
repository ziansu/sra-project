private static android.graphics.Bitmap decodeByteArray(java.lang.String key, byte[] byteArray, com.handlerexploit.prime.utils.ImageManager.OnProcessListener listener) {
    try {
        android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, com.handlerexploit.prime.utils.ImageManager.getBitmapFactoryOptions());
        if (listener != null) {
            bitmap = listener.onPreProcess(bitmap);
        }
        return bitmap;
    } catch (java.lang.Throwable t) {
        com.handlerexploit.prime.utils.ImageManager.printStackTrace(t);
    }
    return null;
}