@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.d(com.glasstowerstudios.garrulo.ui.GarruloMainActivity.LOGTAG, "Destroying Garrulo main activity");
    stopService(new android.content.Intent(this, com.glasstowerstudios.garrulo.service.GarruloListenerService.class));
    mAdapter.shutdown();
    com.glasstowerstudios.garrulo.app.GarruloApplication.getInstance().unsuppressNotifications();
}