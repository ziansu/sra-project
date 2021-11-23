@java.lang.Override
public KVMAgentCommands.NicTO completeNicInformation(org.zstack.header.network.l2.L2NetworkInventory l2Network, org.zstack.header.vm.VmNicInventory nic) {
    org.zstack.network.l2.vxlan.vxlanNetworkPool.VxlanNetworkPoolVO vo = dbf.findByUuid(l2Network.getUuid(), org.zstack.network.l2.vxlan.vxlanNetworkPool.VxlanNetworkPoolVO.class);
    org.zstack.network.l2.vxlan.vxlanNetworkPool.KVMAgentCommands.NicTO to = new org.zstack.network.l2.vxlan.vxlanNetworkPool.KVMAgentCommands.NicTO();
    to.setMac(nic.getMac());
    to.setUuid(nic.getUuid());
    to.setDeviceId(nic.getDeviceId());
    to.setNicInternalName(nic.getInternalName());
    return to;
}