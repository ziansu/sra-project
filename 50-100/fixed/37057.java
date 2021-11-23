@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.status_empty_database);
    android.os.Bundle bundle = getIntent().getExtras();
    title = bundle.getString(Constants.TITLE);
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(Wearable.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
    mGoogleApiClient.connect();
    java.lang.Thread checkThread = new java.lang.Thread(new com.ericfabreu.wearflashcards.activities.SetViewActivity.CheckConnection());
    checkThread.start();
}