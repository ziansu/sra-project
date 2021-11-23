@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.salesforce.androidsdk.reactnative.app.SalesforceReactSDKManager.initReactNative(getApplicationContext(), new com.salesforce.samples.smartsyncexplorerreactnative.ReactNativeKeyImpl(), com.salesforce.samples.smartsyncexplorerreactnative.MainActivity.class);
}