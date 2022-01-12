@java.lang.Override
public void onDestroy() {
    this.unregisterReceiver(this.m24HourResetReceiver);
    android.util.Log.v(com.general.mediaplayer.csr.services.CsrManagerService.TAG, "===onDestroy==");
    super.onDestroy();
}