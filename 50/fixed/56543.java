protected void createAndInitActiveServices() throws java.lang.Exception {
    activeServices = new org.apache.hadoop.yarn.server.resourcemanager.ResourceManager.RMActiveServices(this);
    activeServices.init(conf);
}