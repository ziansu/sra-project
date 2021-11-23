public void startPullReplication() {
    if ((this.mPullReplicator) != null) {
        this.mPullReplicator.start();
        android.util.Log.d(org.ei.opensrp.sync.CloudantSyncHandler.LOG_TAG, this.cloudantFilter);
    }else {
        android.util.Log.e(org.ei.opensrp.sync.CloudantSyncHandler.LOG_TAG, "Pull replication is not set");
    }
}