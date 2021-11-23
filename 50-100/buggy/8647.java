@com.facebook.react.bridge.ReactMethod
public void getFocalLength(com.facebook.react.bridge.ReadableMap options, final com.facebook.react.bridge.Promise promise) {
    android.hardware.Camera camera = com.lwansbrough.RCTCamera.RCTCamera.getInstance().acquireCameraInstance(options.getInt("type"));
    if (null == camera) {
        promise.reject("No camera found.");
        return ;
    }
    promise.resolve(com.lwansbrough.RCTCamera.RCTCamera.getInstance().focusCenter(options.getInt("type")));
}