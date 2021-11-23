@java.lang.Override
public void onClick(android.view.View v) {
    final android.content.Intent syncServiceIntent = new android.content.Intent(getBaseContext(), com.nitdgp.arka.psync.SyncService.class);
    unbindService(syncServiceConnection);
    syncServiceBound = false;
    stopService(syncServiceIntent);
    stopPeerListUIThread();
}