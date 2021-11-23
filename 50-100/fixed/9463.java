@java.lang.Override
public void onBitmapFailed(android.graphics.drawable.Drawable errorDrawable) {
    if ((errorDrawable != null) && (com.layer.ui.util.Log.isLoggable(com.layer.ui.util.Log.VERBOSE))) {
        com.layer.ui.util.Log.v(("onBitMapFailed :" + errorDrawable));
    }
    bitmapWrapper.setBitmap(null);
    callback.onFailure();
    mTargets.remove(this);
}