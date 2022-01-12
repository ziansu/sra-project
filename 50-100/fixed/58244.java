@org.junit.Test(timeout = 20000)
public void loadStreamConfNullOverrides() throws java.lang.Exception {
    org.apache.distributedlog.DistributedLogConfiguration conf = new org.apache.distributedlog.DistributedLogConfiguration();
    org.apache.distributedlog.DistributedLogConfiguration confClone = new org.apache.distributedlog.DistributedLogConfiguration();
    com.google.common.base.Optional<org.apache.distributedlog.DistributedLogConfiguration> streamConfiguration = com.google.common.base.Optional.absent();
    conf.loadStreamConf(streamConfiguration);
    org.apache.commons.configuration.StrictConfigurationComparator comp = new org.apache.commons.configuration.StrictConfigurationComparator();
    assertTrue(comp.compare(conf, confClone));
}