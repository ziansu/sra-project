@org.junit.Test
public void shouldGetVirtualMachineWithoutTagRequirements() throws java.rmi.RemoteException {
    java.util.List<com.vmware.vim25.mo.VirtualMachine> virtualMachines = com.elastisys.scale.cloudpool.vsphere.IntegrationTestClient.vsphereClient.getVirtualMachines(com.google.common.collect.Lists.newArrayList());
    assertFalse(virtualMachines.isEmpty());
}