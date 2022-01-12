@java.lang.Override
protected void onStart() {
    super.onStart();
    if ((mClient) == null) {
        mClient = new com.bluet.utils.BluetoothClient(this);
        mClient.init();
    }
    if ((mClient.mBluetoothAdapter) == null)
        return ;
    
    if (!(mClient.mBluetoothAdapter.isEnabled())) {
        android.content.Intent enableIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(enableIntent, mClient.REQUEST_ENABLE_BT);
    }else {
        if ((mClient.mChatService) == null)
            mClient.setupChat();
        
    }
}