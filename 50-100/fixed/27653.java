public static void main(java.lang.String[] args) {
    java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newCachedThreadPool();
    com.cooksys.assessment.server.Server server = new com.cooksys.assessment.server.Server(8080, executor);
    java.util.concurrent.Future<?> done = executor.submit(server);
    try {
        done.get();
        executor.shutdown();
        executor.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
        com.cooksys.assessment.Main.log.error("Something went wrong :/", e);
    }
}