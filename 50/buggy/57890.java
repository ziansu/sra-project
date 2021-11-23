@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.e(com.biglynx.fulfiller.MainActivity.TAG, "Destroyed....");
    stopService(new android.content.Intent(this, com.biglynx.fulfiller.services.MyJobService.class));
}