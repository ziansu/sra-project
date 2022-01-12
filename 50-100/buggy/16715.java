void reportAssignedSegment(jacz.peerengineservice.util.datatransfer.master.ProviderStatistics providerStatistics, final org.aanguita.jacuzzi.numeric.range.LongRange segment) {
    if (((downloadProgressNotificationHandler) != null) && (providerStatistics != null)) {
        sequentialTaskExecutor.submit(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                downloadProgressNotificationHandler.providerWasAssignedSegment(resourceID, storeName, providerStatistics, downloadManager, segment);
            }
        });
    }
}