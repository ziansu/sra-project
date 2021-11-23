@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.e(TAG, "onCreate");
    mRealmHelper = new com.vsevolod.swipe.addphoto.config.RealmHelper();
    mRealmHelper.open();
    data = mRealmHelper.getData();
    mRealmHelper.getRealm().addChangeListener(this);
    checkAccountAvailability();
    setContentView(R.layout.activity_main);
    setViews();
}