@java.lang.Override
public void onScaleChange(float scaleFactor, float focusX, float focusY) {
    com.facebook.react.bridge.WritableMap scaleChange = com.facebook.react.bridge.Arguments.createMap();
    scaleChange.putDouble("scaleFactor", scaleFactor);
    scaleChange.putDouble("focusX", focusX);
    scaleChange.putDouble("focusY", focusY);
    eventDispatcher.dispatchEvent(new com.reactnative.photoview.ImageEvent(getId(), ImageEvent.ON_SCALE).setExtras(scaleChange));
}