private void checkBluetoothState() {
    if ((mBtAdapter) == null)
        android.util.Log.i(br.inatel.hackathon.vigintillionlocalizer.fragments.BluetoothScannerFragment.TAG, "BLE Error: O dispositivo não suporta Bluetooth!");
    
    if (!(mBtAdapter.isEnabled())) {
        android.content.Intent enableBTIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(enableBTIntent, br.inatel.hackathon.vigintillionlocalizer.fragments.BluetoothScannerFragment.REQUEST_ENABLE_BT);
    }else {
        btLeScanner = mBtAdapter.getBluetoothLeScanner();
        btLeScanner.startScan(br.inatel.hackathon.vigintillionlocalizer.fragments.BluetoothScannerFragment.SCAN_FILTERS, br.inatel.hackathon.vigintillionlocalizer.fragments.BluetoothScannerFragment.SCAN_SETTINGS, scanCallback);
    }
}