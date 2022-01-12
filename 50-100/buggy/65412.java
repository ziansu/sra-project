@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_counter);
    mCountText = ((android.widget.TextView) (findViewById(R.id.count)));
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(Wearable.API).addConnectionCallbacks(mConnectionCallbacks).build();
}