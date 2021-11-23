@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_enter_data);
    if (savedInstanceState == null) {
        allBugs = new java.util.HashSet<vsd.co.za.sambugapp.DomainModels.ScoutBug>();
    }
    android.content.Intent iReceive = getIntent();
    receiveGeoLocation();
    acceptStop(iReceive);
    acceptBlocks(iReceive);
    populateSpinner();
    initializeNumberPickers(savedInstanceState);
}