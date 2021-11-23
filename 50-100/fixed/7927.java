@org.junit.Test
public void getNoMachines() throws java.rmi.RemoteException {
    com.elastisys.scale.cloudpool.vsphere.client.impl.ManagedEntity[] vms = null;
    doReturn(vms).when(com.elastisys.scale.cloudpool.vsphere.client.impl.TestStandardVsphereClient.mockInventoryNavigator).searchManagedEntities(anyString());
    com.elastisys.scale.cloudpool.vsphere.client.impl.TestStandardVsphereClient.vsphereClient.configure(com.elastisys.scale.cloudpool.vsphere.client.impl.TestStandardVsphereClient.vsphereApiSettings, com.elastisys.scale.cloudpool.vsphere.client.impl.TestStandardVsphereClient.vsphereProvisioningTemplate);
    java.util.List<com.elastisys.scale.cloudpool.vsphere.client.impl.VirtualMachine> virtualMachines = com.elastisys.scale.cloudpool.vsphere.client.impl.TestStandardVsphereClient.vsphereClient.getVirtualMachines(com.google.common.collect.Lists.newArrayList());
    assertEquals(virtualMachines.size(), 0);
}