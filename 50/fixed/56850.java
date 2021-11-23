@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    stopService(new android.content.Intent(this, com.glasstowerstudios.garrulo.service.GarruloListenerService.class));
    mAdapter.shutdown();
    com.glasstowerstudios.garrulo.app.GarruloApplication.getInstance().unsuppressNotifications();
}