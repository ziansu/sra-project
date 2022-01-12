private void initializeClient() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();
    java.util.concurrent.Future<java.util.List<java.lang.Integer>> future = executor.submit(new com.bogdanbuduroiu.zeplerchat.client.controller.RegistryDiscoveryWorker());
    liveClients = future.get();
    myPort = liveClients.get(((liveClients.size()) - 1));
    for (java.lang.Integer port : liveClients) {
        java.lang.System.out.println(port);
    }
    executor.shutdown();
}