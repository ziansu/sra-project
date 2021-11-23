@java.lang.Override
protected void onDestroy() {
    android.util.Log.v(LOG_TAG, "onDestroy()");
    super.onDestroy();
    com.example.shreekant.sunshine.app.ViewServer.get(this).removeWindow(this);
}