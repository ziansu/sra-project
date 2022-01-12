@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    signedIn = false;
    com.swen900014.orange.rideshareoz.utils.MyRequestQueue.getInstance(this.getApplicationContext()).getRequestQueue();
    this.savedInstanceState = savedInstanceState;
    com.swen900014.orange.rideshareoz.views.MainActivity.mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(Plus.API).addScope(Plus.SCOPE_PLUS_LOGIN).addScope(Plus.SCOPE_PLUS_PROFILE).build();
    com.swen900014.orange.rideshareoz.views.MainActivity.mGoogleApiClient.connect();
}