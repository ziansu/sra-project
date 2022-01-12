@java.lang.Override
public void onResume() {
    super.onResume();
    if ((mGoogleApiClient.isConnected()) && (!(mRequestingLocationUpdates))) {
        startLocationUpdates();
    }
    registerReceiver(mGattUpdateReceiver, com.example.sdp11.wmd.MainActivity.makeGattUpdateIntentFilter());
    if ((com.example.sdp11.wmd.MainActivity.mBluetoothLEService) != null) {
    }
}