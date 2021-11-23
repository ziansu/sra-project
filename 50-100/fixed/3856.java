private void syncSecurityGroup(org.opendaylight.neutron.spi.NeutronSecurityRule securityRule, org.opendaylight.neutron.spi.NeutronPort port, boolean write) {
    if (null != (securityRule.getSecurityRemoteGroupID())) {
        java.util.List<org.opendaylight.neutron.spi.Neutron_IPs> vmIpList = securityServicesManager.getVmListForSecurityGroup(port.getID(), securityRule.getSecurityRemoteGroupID());
        for (org.opendaylight.neutron.spi.Neutron_IPs vmIp : vmIpList) {
            securityServicesManager.syncSecurityRule(port, securityRule, vmIp, write);
        }
    }else {
        securityServicesManager.syncSecurityRule(port, securityRule, null, write);
    }
}