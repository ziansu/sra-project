protected void downloadAssets(final java.util.Set<java.lang.String> assetsQueue) {
    final java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newSingleThreadExecutor();
    try {
        final com.swrve.sdk.SwrveAssetsCompleteCallback callback = new com.swrve.sdk.SwrveAssetsCompleteCallback() {
            @java.lang.Override
            public void complete() {
                autoShowMessages();
            }
        };
        executorService.execute(com.swrve.sdk.SwrveRunnables.withoutExceptions(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                swrveAssetsManager.downloadAssets(assetsQueue, callback);
            }
        }));
    } finally {
        executorService.shutdown();
    }
}