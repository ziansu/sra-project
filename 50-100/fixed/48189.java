public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.util.ResourceBundle configs = java.util.ResourceBundle.getBundle("configs");
    tikitiki.batch.CacheUpdateTask cacheUpdateTask = new tikitiki.batch.CacheUpdateTask(configs.getString("jdbc.url"));
    cacheUpdateTask.run();
    cacheUpdateTask.start();
    org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(80);
    server.setHandler(new tikitiki.web.QueryTuningHandler());
    server.start();
    new tikitiki.util.ServerWarmupThread(server).start();
}