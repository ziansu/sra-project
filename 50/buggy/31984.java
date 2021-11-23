@java.lang.Override
protected void onStart() {
    super.onStart();
    android.util.Log.e(com.example.sdp11.wmd.MainActivity.TAG, "onStart");
    mGoogleApiClient.connect();
}