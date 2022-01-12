@java.lang.Override
protected void onDestroy() {
    mBluetoothAdapter.cancelDiscovery();
    android.util.Log.d(edu.gatech.cc.cs7470.facecard.View.activities.MainActivity.TAG, "onDestroy GoogleApiClient disconnected");
    if (mGoogleApiClient.isConnected()) {
        mGoogleApiClient.disconnect();
    }
    super.onDestroy();
}