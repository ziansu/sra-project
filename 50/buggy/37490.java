@java.lang.Override
public synchronized void onResume() {
    super.onResume();
    com.topodroid.DistoX.TDLog.Debug("device activity on resume");
    registerReceiver(mPairReceiver, new android.content.IntentFilter(android.bluetooth.BluetoothDevice.ACTION_BOND_STATE_CHANGED));
    mApp.resumeComm();
    mApp.mDeviceActivityVisible = true;
    com.topodroid.DistoX.TDLog.Debug("device activity on resume done");
}