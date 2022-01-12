@java.lang.Override
public void onCreate() {
    java.lang.System.out.println("service on create");
    super.onCreate();
    mHandler = new android.os.Handler();
    mDisconnectRunnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (((mConnectionState) == (com.wm.blecore.BluetoothLeService.STATE_CONNECTING)) || ((mConnectionState) == (com.wm.blecore.BluetoothLeService.STATE_CONNECTED))) {
                disconnect();
                java.lang.System.out.println("handler post delayed executed");
                broadcastUpdate(com.wm.blecore.BluetoothLeService.ACTION_GATT_DISCONNECTED);
            }
        }
    };
}