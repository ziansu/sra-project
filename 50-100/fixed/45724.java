public void initializeTasks() {
    try {
        serverInformation = platform.getApiClient().getServerInformation();
    } catch (java.io.IOException | net.buycraft.plugin.client.ApiException e) {
        throw new java.lang.RuntimeException("Can't fetch account information", e);
    }
    executorService.schedule((playerFetcher = ((checkInterval) == null) ? new net.buycraft.plugin.execution.DuePlayerFetcher(platform, verbose) : new net.buycraft.plugin.execution.DuePlayerFetcher(platform, verbose, checkInterval)), 1, java.util.concurrent.TimeUnit.SECONDS);
}