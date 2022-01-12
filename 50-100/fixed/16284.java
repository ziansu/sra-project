private void syncSecurityGroup(org.opendaylight.ovsdb.openstack.netvirt.translator.NeutronSecurityRule securityRule, org.opendaylight.ovsdb.openstack.netvirt.translator.NeutronPort port, boolean write) {
    if (null != (securityRule.getSecurityRemoteGroupID())) {
        java.util.List<org.opendaylight.ovsdb.openstack.netvirt.translator.Neutron_IPs> vmIpList = securityServicesManager.getVmListForSecurityGroup(port.getID(), securityRule.getSecurityRemoteGroupID());
        for (org.opendaylight.ovsdb.openstack.netvirt.translator.Neutron_IPs vmIp : vmIpList) {
            securityServicesManager.syncSecurityRule(port, securityRule, vmIp, write);
        }
    }else {
        securityServicesManager.syncSecurityRule(port, securityRule, null, write);
    }
}