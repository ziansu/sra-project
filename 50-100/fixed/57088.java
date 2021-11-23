@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.shuxun.react_native_mixpush.MixPushPackage(), new com.oblador.vectoricons.VectorIconsPackage(), com.bugsnag.BugsnagReactNative.getPackage(), new com.RNFetchBlob.RNFetchBlobPackage(), new com.lwansbrough.RCTCamera.RCTCameraPackage(), new org.lovebing.reactnative.baidumap.BaiduMapPackage(getApplicationContext()));
}