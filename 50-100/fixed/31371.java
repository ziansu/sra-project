@com.facebook.react.bridge.ReactMethod
public void getBase64String(final com.facebook.react.bridge.ReadableMap options, final com.facebook.react.bridge.Callback callback) {
    try {
        parseOptions(options);
        android.graphics.Bitmap image = MediaStore.Images.Media.getBitmap(this.context.getContentResolver(), android.net.Uri.parse(url));
        if (image == null) {
            callback.invoke(("Failed to decode Bitmap, uri: " + (url)));
        }else {
            callback.invoke(null, bitmapToBase64(image));
        }
    } catch (java.io.IOException e) {
    }
}