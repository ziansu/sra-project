@java.lang.Override
public void onStart() {
    super.onStart();
    android.content.Intent intent = new android.content.Intent(this, dg.shenm233.mmaps.service.OfflineMapService.class);
    bindService(intent, mConnection, dg.shenm233.mmaps.ui.BIND_AUTO_CREATE);
}