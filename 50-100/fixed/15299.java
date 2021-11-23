synchronized void removeProvider(jacz.peerengineservice.util.datatransfer.master.ProviderStatistics providerStatistics, jacz.peerengineservice.PeerId peerId) {
    if (((downloadProgressNotificationHandler) != null) && (providerStatistics != null)) {
        sequentialTaskExecutor.submit(() -> downloadProgressNotificationHandler.providerRemoved(resourceID, storeName, providerStatistics, downloadManager, peerId));
    }
}