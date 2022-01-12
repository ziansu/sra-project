private void registerSyncStatusBroadcastReceiver() {
    syncStatusBroadcastReceiver = new org.ei.opensrp.path.receiver.SyncStatusBroadcastReceiver();
    syncStatusBroadcastReceiver.addSyncStatusListener(this);
    registerReceiver(syncStatusBroadcastReceiver, new android.content.IntentFilter(org.ei.opensrp.path.receiver.SyncStatusBroadcastReceiver.ACTION_SYNC_STATUS));
}