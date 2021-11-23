@org.junit.BeforeClass
public static void setUpClass() {
    org.holodeckb2b.integ.OutFlowIT.itHelper = new org.holodeckb2b.integ.ITHelper();
    org.holodeckb2b.integ.OutFlowIT.itHelper.unzipHolodeckDistribution(org.holodeckb2b.integ.OutFlowIT.dADirName);
    org.holodeckb2b.integ.OutFlowIT.itHelper.unzipHolodeckDistribution(org.holodeckb2b.integ.OutFlowIT.dBDirName);
    org.holodeckb2b.integ.OutFlowIT.itHelper.createDataMsgDirs(org.holodeckb2b.integ.OutFlowIT.dADirName);
    org.holodeckb2b.integ.OutFlowIT.itHelper.createDataMsgDirs(org.holodeckb2b.integ.OutFlowIT.dBDirName);
    org.holodeckb2b.integ.OutFlowIT.itHelper.copyPModeDescriptor(org.holodeckb2b.integ.OutFlowIT.dADirName, "ex-pm-push-init.xml");
    org.holodeckb2b.integ.OutFlowIT.itHelper.copyPModeDescriptor(org.holodeckb2b.integ.OutFlowIT.dBDirName, "ex-pm-push-resp.xml");
    org.holodeckb2b.integ.OutFlowIT.itHelper.modifyAxisServerPort(org.holodeckb2b.integ.OutFlowIT.dBDirName, "9090");
    org.holodeckb2b.integ.OutFlowIT.itHelper.startHolodeckB2BInstances(org.holodeckb2b.integ.OutFlowIT.dADirName, org.holodeckb2b.integ.OutFlowIT.dBDirName);
    org.holodeckb2b.integ.OutFlowIT.itHelper.copyExampleDataToMsgOutDir(org.holodeckb2b.integ.OutFlowIT.dADirName);
}