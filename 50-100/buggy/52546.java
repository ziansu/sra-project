private boolean createBridge(java.lang.String tenantName, java.lang.String bridgeName) {
    boolean status = false;
    org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId vlanId = new org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId(0);
    status = vtnManangerService.updateBridge(tenantName, bridgeName, (bridgeName + " description"), VnodeUpdateMode.CREATE);
    if (status) {
        org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.AddVlanMapInput input = new org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.AddVlanMapInputBuilder().setBridgeName(bridgeName).setTenantName(tenantName).setVlanId(vlanId).build();
        status = vtnManangerService.setVlanMap(input);
    }
    return status;
}