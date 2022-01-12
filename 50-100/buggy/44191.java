private void connectionLost() {
    com.smartdevicelink.transport.MultiplexBluetoothTransport.listening = false;
    android.os.Message msg = mHandler.obtainMessage(SdlRouterService.MESSAGE_TOAST);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(com.smartdevicelink.transport.MultiplexBluetoothTransport.TOAST, "Device connection was lost");
    msg.setData(bundle);
    com.smartdevicelink.transport.MultiplexBluetoothTransport.getBluetoothSerialServerInstance().mHandler.sendMessage(msg);
    com.smartdevicelink.transport.MultiplexBluetoothTransport.getBluetoothSerialServerInstance().stop();
}