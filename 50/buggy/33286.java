private void initService() {
    connection = new com.lidengqi.lianxi.ui.activity.AidlActivity.AdditionServiceConnection();
    android.content.Intent intent = new android.content.Intent();
    intent.setClassName("com.lidengqi.lianxi.aidl", com.lidengqi.lianxi.aidl.AdditionService.class.getName());
    boolean ret = bindService(intent, connection, Context.BIND_AUTO_CREATE);
}