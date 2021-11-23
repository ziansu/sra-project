@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.i("SalesforceDroidGapActivity.onCreate", "onCreate called");
    super.onCreate(savedInstanceState);
    init();
    bootconfig = com.salesforce.androidsdk.rest.BootConfig.getBootConfig(this);
    clientManager = buildClientManager();
    passcodeManager = com.salesforce.androidsdk.app.SalesforceSDKManager.getInstance().getPasscodeManager();
    userSwitchReceiver = new com.salesforce.androidsdk.ui.sfhybrid.SalesforceDroidGapActivity.DroidGapUserSwitchReceiver();
    registerReceiver(userSwitchReceiver, new android.content.IntentFilter(com.salesforce.androidsdk.accounts.UserAccountManager.USER_SWITCH_INTENT_ACTION));
    android.webkit.CookieSyncManager.createInstance(this);
    com.salesforce.androidsdk.util.EventsObservable.get().notifyEvent(EventType.MainActivityCreateComplete, this);
}