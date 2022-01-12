@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    unbindService(mServiceConnection);
    com.example.sdp11.wmd.MainActivity.mBluetoothLEService = null;
    unregisterReceiver(mGattUpdateReceiver);
}