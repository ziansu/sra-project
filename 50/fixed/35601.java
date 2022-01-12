@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.salesforce.androidsdk.reactnative.app.SalesforceReactSDKManager.initReactNative(getApplicationContext(), null, com.salesforce.samples.smartsyncexplorerreactnative.MainActivity.class);
}