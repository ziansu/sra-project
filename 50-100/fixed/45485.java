void connectBt() {
    if ((mChatService.getState()) == (com.quadcoder.coinpet.bluetooth.BluetoothManager.STATE_BT_ENABLED)) {
        mDevice = mChatService.searchPaired();
        if ((mDevice) != null) {
            mChatService.connect(mDevice);
        }else {
            discovery();
        }
    }
}