private static android.graphics.Bitmap decodeStreamInternal(java.io.InputStream is, android.graphics.Rect outPadding, android.graphics.BitmapFactory.Options opts, boolean consumeRights) {
    byte[] tempStorage = null;
    if (opts != null)
        tempStorage = opts.inTempStorage;
    
    if (tempStorage == null)
        tempStorage = new byte[android.graphics.BitmapFactory.DECODE_BUFFER_SIZE];
    
    return android.graphics.BitmapFactory.nativeDecodeStream(is, tempStorage, outPadding, opts, consumeRights);
}