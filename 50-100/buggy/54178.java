public void init() {
    java.lang.System.out.println("ClientReadHandler initializing");
    ioThread.addTaskAndWakeup(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                logger.warning("Starting to read");
                registerOp(java.nio.channels.SelectionKey.OP_READ);
                logger.warning("Successfully reading");
            } catch (java.lang.Throwable t) {
                onFailure(t);
            }
        }
    });
}