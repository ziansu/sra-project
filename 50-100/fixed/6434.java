@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    mFragmentManager = getSupportFragmentManager();
    mWearData = new ca.hoogit.powerhour.Game.WearData(this);
    super.onCreate(savedInstanceState);
    ca.hoogit.powerhour.Util.SharedPrefs prefs = ca.hoogit.powerhour.Util.SharedPrefs.get(this);
    if (prefs.isFirstRun()) {
        prefs.setFirstRun(false);
        startActivity(new android.content.Intent(this, ca.hoogit.powerhour.About.TourActivity.class));
    }
    setupListeners();
}