@com.facebook.react.bridge.ReactMethod
public void enableProgressSent(boolean enabled, com.facebook.react.bridge.Promise promise) {
    com.mybigday.rns3.RNS3TransferUtility.enabledProgress = enabled;
    promise.resolve(true);
}