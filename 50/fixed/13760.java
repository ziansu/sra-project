public java.util.List<org.opendaylight.neutron.spi.NeutronLoadBalancerPoolMember> getLoadBalancerPoolMembers() {
    if ((loadBalancerPoolMembers) != null) {
        for (org.opendaylight.neutron.spi.NeutronLoadBalancerPoolMember member : loadBalancerPoolMembers)
            member.setPoolID(loadBalancerPoolID);
        
        return loadBalancerPoolMembers;
    }
    return loadBalancerPoolMembers;
}