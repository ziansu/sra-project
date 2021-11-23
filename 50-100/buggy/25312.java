@java.lang.Override
public void onViewTap(android.view.View view, float x, float y) {
    com.facebook.react.bridge.WritableMap scaleChange = com.facebook.react.bridge.Arguments.createMap();
    scaleChange.putDouble("x", x);
    scaleChange.putDouble("y", y);
    eventDispatcher.dispatchEvent(new com.reactnative.photoview.ImageEvent(getId(), com.facebook.react.common.SystemClock.nanoTime(), ImageEvent.ON_TAP).setExtras(scaleChange));
}