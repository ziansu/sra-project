@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPrefs = getSharedPreferences(SMSReceiveService.PREFERENCES, com.adonai.GsmNotify.MODE_PRIVATE);
    sentReceiver = new com.adonai.GsmNotify.misc.SentConfirmReceiver(this);
    deliveryReceiver = new com.adonai.GsmNotify.misc.DeliveryConfirmReceiver(this);
    getLoaderManager().initLoader(com.adonai.GsmNotify.SelectorActivity.STATUS_LOADER, null, mLocalArchiveParseCallback);
    mUiHandler = new android.os.Handler(mStatusWalkCallback);
}