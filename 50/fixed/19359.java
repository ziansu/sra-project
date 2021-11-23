public static com.spinn3r.artemis.util.misc.ExecutorServices.ShutdownAwaiter shutdownAndAwaitTermination(java.util.concurrent.ExecutorService executorService) {
    return new com.spinn3r.artemis.util.misc.ExecutorServices.ShutdownAwaiter(executorService, false);
}