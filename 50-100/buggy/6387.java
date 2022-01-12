synchronized void processTimeouts() {
    long cur = java.lang.System.currentTimeMillis();
    java.util.List<org.ethereum.sync.WarpSyncManager.StateChunkRequest> requests = new java.util.ArrayList(pendingStateChunks.values());
    for (org.ethereum.sync.WarpSyncManager.StateChunkRequest request : requests) {
        if ((cur - (request.requestSent)) > (org.ethereum.sync.WarpSyncManager.CHUNK_DL_TIMEOUT)) {
            org.ethereum.sync.WarpSyncManager.logger.trace("Removing state chunk {} from pending due to timeout", org.spongycastle.util.encoders.Hex.toHexString(request.stateChunkHash));
            pendingStateChunks.remove(request.stateChunkHash);
            stateChunkQueue.addFirst(request);
        }
    }
}