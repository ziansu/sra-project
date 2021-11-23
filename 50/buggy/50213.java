public void start() {
    stop(false);
    started.set(true);
    registerFuture = schedExecutor.submit(new org.eclipse.leshan.client.servers.RegistrationEngine.RegistrationTask());
}