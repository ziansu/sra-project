public void initializeAsYarn(java.lang.Boolean autorestartContainer) throws java.lang.Exception {
    this.autorestartContainer = autorestartContainer;
    rmClient = org.apache.hadoop.yarn.client.api.async.AMRMClientAsync.createAMRMClientAsync(100, listener);
    rmClient.init(yarnConfig);
    nmClient = org.apache.hadoop.yarn.client.api.NMClient.createNMClient();
    nmClient.init(yarnConfig);
    rmClient.start();
    rmClient.registerApplicationMaster("", 0, "");
    nmClient.start();
}