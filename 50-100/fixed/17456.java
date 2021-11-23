@com.facebook.react.bridge.ReactMethod
public void getDeviceId(com.facebook.react.bridge.Promise promise) {
    try {
        java.lang.String androidId = Settings.Secure.getString(getCurrentActivity().getContentResolver(), Settings.Secure.ANDROID_ID);
        promise.resolve(androidId);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        promise.reject(e.getMessage(), e);
    } catch (java.lang.Throwable throwable) {
        throwable.printStackTrace();
    }
}