@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new io.sentry.RNSentryPackage(this), new com.reactnative.photoview.PhotoViewPackage(), new com.remobile.toast.RCTToastPackage(), new com.RNFetchBlob.RNFetchBlobPackage(), new com.zmxv.RNSound.RNSoundPackage(), new com.learnium.RNDeviceInfo.RNDeviceInfo(), new com.zulipmobile.ZulipNativePackage(), new com.wix.reactnativenotifications.RNNotificationsPackage(this));
}