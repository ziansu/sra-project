void broadcastFinish(com.lody.virtual.helper.proto.PendingResultData res) {
    synchronized(mBroadcastRecords) {
        com.lody.virtual.server.am.BroadcastSystem.BroadcastRecord record = mBroadcastRecords.remove(res.mToken);
        if (record == null) {
            com.lody.virtual.helper.utils.VLog.e(com.lody.virtual.server.am.BroadcastSystem.TAG, ("Unable to find the BroadcastRecord by token: " + (res.mToken)));
        }
    }
    mTimeoutHandler.removeMessages(0, res.mToken);
    res.build().finish();
}