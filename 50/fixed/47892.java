private void start() {
    com.google.inject.Injector injector = com.google.inject.Guice.createInjector();
    getSchedulerThread(injector).start();
}