void removeProvider(jacz.peerengineservice.util.datatransfer.master.ProviderStatistics providerStatistics, jacz.peerengineservice.PeerId peerId) {
    if (((downloadProgressNotificationHandler) != null) && (providerStatistics != null)) {
        sequentialTaskExecutor.submit(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                downloadProgressNotificationHandler.providerRemoved(resourceID, storeName, providerStatistics, downloadManager, peerId);
            }
        });
    }
}