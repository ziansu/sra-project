public void start() {
    stop(false);
    synchronized(this) {
        started = true;
        registerFuture = schedExecutor.submit(new org.eclipse.leshan.client.servers.RegistrationEngine.RegistrationTask());
    }
}