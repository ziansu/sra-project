@java.lang.Override
public void onStart() {
    super.onStart();
    if (com.example.christen.eecs398_ui.LockListScreen.D) {
        android.util.Log.e(com.example.christen.eecs398_ui.LockListScreen.TAG, "++ ON START ++");
    }
    if (!(com.example.christen.eecs398_ui.LockListScreen.USING_EMULATOR)) {
        if (!(mBluetoothAdapter.isEnabled())) {
            android.content.Intent enableIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableIntent, com.example.christen.eecs398_ui.LockListScreen.REQUEST_ENABLE_BT);
        }else {
            if ((mLockService) == null) {
                setupLockScreenAndService();
            }
        }
    }
}