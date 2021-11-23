@java.lang.Override
public void onStart() {
    android.util.Log.d(com.seafile.seadroid2.ui.activity.AccountsActivity.DEBUG_TAG, "onStart");
    super.onStart();
    com.seafile.seadroid2.ui.activity.Intent bIntent = new com.seafile.seadroid2.ui.activity.Intent(this, com.seafile.seadroid2.monitor.FileMonitorService.class);
    bindService(bIntent, mMonitorConnection, Context.BIND_AUTO_CREATE);
}