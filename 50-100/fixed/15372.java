private void closeAndWaitForRecovery(com.rabbitmq.client.impl.recovery.AutorecoveringConnection connection) throws java.io.IOException, java.lang.InterruptedException {
    final java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(1);
    connection.addRecoveryListener(new com.rabbitmq.client.test.functional.RecoveryListener() {
        public void handleRecovery(com.rabbitmq.client.test.functional.Recoverable recoverable) {
            latch.countDown();
        }

        @java.lang.Override
        public void handleRecoveryStarted(com.rabbitmq.client.test.functional.Recoverable recoverable) {
        }
    });
    com.rabbitmq.tools.Host.closeConnection(connection);
    assertTrue(latch.await(5, java.util.concurrent.TimeUnit.SECONDS));
}