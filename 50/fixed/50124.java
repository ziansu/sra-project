@java.lang.Override
public void run() {
    if ((com.google.pubsub.clients.common.LoadTestRunner.server) != null) {
        com.google.pubsub.clients.common.LoadTestRunner.log.error("Shutting down server since JVM is shutting down.");
        com.google.pubsub.clients.common.LoadTestRunner.server.shutdown();
    }
}