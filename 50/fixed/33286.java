private void initService() {
    connection = new com.lidengqi.lianxi.ui.activity.AidlActivity.AdditionServiceConnection();
    android.content.Intent intent = new android.content.Intent(this, com.lidengqi.lianxi.aidl.AdditionService.class);
    boolean ret = bindService(intent, connection, Context.BIND_AUTO_CREATE);
}