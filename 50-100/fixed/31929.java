@java.lang.Override
public void initialize(com.twitter.heron.scheduler.mesos.Config schedulerConfig, com.twitter.heron.scheduler.mesos.Config runtimeConfig) {
    com.twitter.heron.scheduler.mesos.MesosScheduler.LOG.info("Initializing new mesos topology scheduler");
    this.tmasterRestart = new java.util.concurrent.atomic.AtomicBoolean(true);
    this.config = schedulerConfig;
    this.runtime = runtimeConfig;
    this.jobScheduler = getJobScheduler();
    this.jobScheduler.start();
    this.topologyPackageUri = java.lang.System.getenv("TOPOLOGY_PACKAGE_URI");
    this.corePackageURI = java.lang.System.getenv("CORE_PACKAGE_URI");
}