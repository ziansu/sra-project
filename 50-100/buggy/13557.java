@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    mReactNativePushNotificationPackage = new com.dieam.reactnativepushnotification.ReactNativePushNotificationPackage(this);
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.airbnb.android.react.maps.MapsPackage(), new com.learnium.RNDeviceInfo.RNDeviceInfo(), new com.i18n.reactnativei18n.ReactNativeI18n(), new com.oblador.vectoricons.VectorIconsPackage(), mReactNativePushNotificationPackage);
}