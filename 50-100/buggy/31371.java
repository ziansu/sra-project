@com.facebook.react.bridge.ReactMethod
public void getBase64String(final com.facebook.react.bridge.ReadableMap options, final com.facebook.react.bridge.Callback callback) {
    try {
        android.graphics.Bitmap image = MediaStore.Images.Media.getBitmap(this.context.getContentResolver(), android.net.Uri.parse(options.uri));
        if (image == null) {
            callback.invoke(("Failed to decode Bitmap, uri: " + (options.uri)));
        }else {
            parseOptions(options);
            callback.invoke(null, bitmapToBase64(image));
        }
    } catch (java.io.IOException e) {
    }
}