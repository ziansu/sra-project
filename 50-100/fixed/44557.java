@org.junit.Test
public void shouldNotGetVirtualMachinesForTagThatDoesNotExist() throws java.rmi.RemoteException {
    java.util.List<com.elastisys.scale.cloudpool.vsphere.tag.Tag> tags = com.google.common.collect.Lists.newArrayList();
    tags.add(new com.elastisys.scale.cloudpool.vsphere.tag.impl.VsphereTag(com.elastisys.scale.cloudpool.vsphere.tag.impl.ScalingTag.CLOUD_POOL, "NoSuchPool"));
    java.util.List<com.vmware.vim25.mo.VirtualMachine> virtualMachines = com.elastisys.scale.cloudpool.vsphere.IntegrationTestClient.vsphereClient.getVirtualMachines(tags);
    assertTrue(virtualMachines.isEmpty());
}