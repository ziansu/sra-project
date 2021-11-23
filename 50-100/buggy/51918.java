@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home_fragment);
    currentActivity = this;
    initInstances();
    loadTags();
    setLayout();
    setEvent();
    setStatusBarColor();
    initFirebaseMessaging();
    initGeofences();
    home_fragment_viewpager.setCurrentItem(1);
}