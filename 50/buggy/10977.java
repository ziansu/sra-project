public void requestStop() {
    new org.gradle.messaging.concurrent.DefaultExecutorFactory().create("Daemon Async Stop Request").execute(new java.lang.Runnable() {
        public void run() {
            stop();
        }
    });
}