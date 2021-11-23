@java.lang.Override
protected void onResume() {
    super.onResume();
    android.content.Intent intent = new android.content.Intent(this, com.android.grabhouse.FetchAndSaveDataService.class);
    bindService(intent, connection, Context.BIND_AUTO_CREATE);
}