public java.util.Iterator listNetworks() {
    org.jclouds.openstack.neutron.v2.features.NetworkApi networkApi = neutronApi.getNetworkApi("RegionOne");
    org.jclouds.openstack.neutron.v2.domain.Networks it2 = networkApi.list(new org.jclouds.openstack.v2_0.options.PaginationOptions());
    java.util.Iterator iter = it2.iterator();
    if (iter.hasNext()) {
        return iter;
    }else {
        return null;
    }
}