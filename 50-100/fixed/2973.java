public void connectionLost() {
    android.os.Message msg = mHandler.obtainMessage(Constants.MESSAGE_TOAST);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(Constants.TOAST, "Verbindung wurde getrennt");
    msg.setData(bundle);
    mHandler.sendMessage(msg);
    multiActivity.setActiveConnection(false);
    android.util.Log.d(de.hft.stuttgart.strawberry.bluetoothservice.BluetoothService.TAG, "startConnection() from connectionLost()");
    this.startConnection();
}