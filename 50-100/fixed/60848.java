@java.lang.Override
public void onResume() {
    super.onResume();
    if ((mGoogleApiClient.isConnected()) && (!(mRequestingLocationUpdates))) {
        startLocationUpdates();
    }
    registerReceiver(mGattUpdateReceiver, com.example.sdp11.wmd.MainActivity.makeGattUpdateIntentFilter());
    if ((com.example.sdp11.wmd.MainActivity.mBluetoothLEService) != null) {
        final boolean result = com.example.sdp11.wmd.MainActivity.mBluetoothLEService.connect(com.example.sdp11.wmd.MainActivity.mDeviceAddress);
        android.util.Log.i(com.example.sdp11.wmd.MainActivity.TAG, ("Connect request result=" + result));
    }
}