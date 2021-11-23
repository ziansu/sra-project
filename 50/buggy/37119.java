public void wakeUp(freenet.client.async.ClientContext context) {
    context.mainExecutor.execute(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            sched.wakeStarter();
        }
    });
}