private void connectionLost() {
    android.os.Message msg = mHandler.obtainMessage(SdlRouterService.MESSAGE_TOAST);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(com.smartdevicelink.transport.MultiplexBluetoothTransport.TOAST, "Device connection was lost");
    msg.setData(bundle);
    mHandler.sendMessage(msg);
    stop();
}