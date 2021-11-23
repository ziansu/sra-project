private void start() {
    com.google.inject.Injector injector = com.google.inject.Guice.createInjector(new org.apache.mesos.hdfs.scheduler.HdfsSchedulerModule());
    getSchedulerThread(injector).start();
}