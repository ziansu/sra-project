protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case net.lorenzobianconi.wwatcher.WWatcher.REQ_ENABLE_BT :
            boolean btEnabled = resultCode == (RESULT_OK);
            configureButton(btEnabled, false);
            break;
        case net.lorenzobianconi.wwatcher.WWatcher.REQ_PICK_DEV :
            if (data != null) {
                java.lang.String addr = data.getExtras().getString("device");
                android.bluetooth.BluetoothDevice device = inqMap.get(addr);
                new net.lorenzobianconi.wwatcher.WWatcher.BtConnect().execute(device);
            }
            break;
        default :
            break;
    }
}