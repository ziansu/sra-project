@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.firebase.client.Firebase.setAndroidContext(this);
    locationHelper = new lostandfound.mi.ur.de.lostandfound.LocationHelper(getApplicationContext());
    initButtons();
    initBars();
    initTabs();
    initLists();
    getFireBaseData(lostListView, "LostItem");
    getFireBaseData(foundListView, "FoundItem");
    buildGoogleApiClient();
}