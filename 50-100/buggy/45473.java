@org.junit.Test
public void listMachinesShouldReturnListOfVms() throws java.lang.Exception {
    com.elastisys.scale.cloudpool.vsphere.client.impl.ManagedEntity[] vms = new com.elastisys.scale.cloudpool.vsphere.client.impl.ManagedEntity[]{ new com.elastisys.scale.cloudpool.vsphere.util.MockedVm().build() };
    doReturn(vms).when(com.elastisys.scale.cloudpool.vsphere.client.impl.TestStandardVsphereClient.mockInventoryNavigator).searchManagedEntities(anyString());
    com.elastisys.scale.cloudpool.vsphere.client.impl.TestStandardVsphereClient.vsphereClient.configure(com.elastisys.scale.cloudpool.vsphere.client.impl.TestStandardVsphereClient.vsphereApiSettings, com.elastisys.scale.cloudpool.vsphere.client.impl.TestStandardVsphereClient.vsphereProvisioningTemplate);
    java.util.List<com.elastisys.scale.cloudpool.vsphere.client.impl.VirtualMachine> virtualMachines = com.elastisys.scale.cloudpool.vsphere.client.impl.TestStandardVsphereClient.vsphereClient.getVirtualMachines(com.google.common.collect.Lists.newArrayList());
    org.junit.Assert.assertEquals(virtualMachines.size(), 1);
}