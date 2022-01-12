private void GetBlueToothStatus() {
    android.bluetooth.BluetoothAdapter mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if ((mBluetoothAdapter != null) && (mBluetoothAdapter.isEnabled())) {
        android.util.Log.d(tom.pearson.PocketKnife.MainActivity.TAG, ("checkNetworkConnection" + (getString(R.string.bluetooth))));
        mTextMessage.append(getString(R.string.bluetooth));
    }else {
        android.util.Log.d(tom.pearson.PocketKnife.MainActivity.TAG, ("checkNetworkConnection" + (getString(R.string.no_bluetooth))));
        mTextMessage.append(getString(R.string.no_bluetooth));
    }
}