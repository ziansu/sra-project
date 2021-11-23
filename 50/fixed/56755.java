@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((this.serviceBL) != null) {
        com.bytereal.byterealblesdk.broadcast.register.RegisteredBroadcast.unRegisterBluetoothBroadcast(this);
        context.stopService(this.serviceBL);
    }
}