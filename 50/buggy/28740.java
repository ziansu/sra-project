@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.e(com.example.sdp11.wmd.MainActivity.TAG, "onDestroy");
    unbindService(mServiceConnection);
    com.example.sdp11.wmd.MainActivity.mBluetoothLEService = null;
    unregisterReceiver(mGattUpdateReceiver);
}