private boolean isEnableBluetoothSetting() {
    if (((bluetoothAdapter) != null) || (bluetoothAdapter.isEnabled())) {
        return true;
    }else {
        return false;
    }
}