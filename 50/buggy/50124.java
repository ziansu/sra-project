@java.lang.Override
public void run() {
    com.google.pubsub.clients.common.LoadTestRunner.log.error("Shutting down server since JVM is shutting down.");
    if ((com.google.pubsub.clients.common.LoadTestRunner.server) != null) {
        com.google.pubsub.clients.common.LoadTestRunner.server.shutdown();
    }
    com.google.pubsub.clients.common.LoadTestRunner.log.error("Server shut down.");
}