@java.lang.Override
public int getMemorySize() {
    org.mqnaas.extensions.openstack.capabilities.impl.OpenstackHostAdministration.log.debug((("Getting memory size of host [id=" + (resource.getId())) + "]"));
    org.jclouds.openstack.nova.v2_0.domain.Server server = getServer();
    org.jclouds.openstack.nova.v2_0.domain.Flavor flavor = ((org.jclouds.openstack.nova.v2_0.domain.Flavor) (server.getFlavor()));
    return flavor.getRam();
}