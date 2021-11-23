@java.lang.Override
public void rebind() {
    super.rebind();
    dockerHost = ((brooklyn.entity.container.docker.DockerHost) (getConfig(brooklyn.location.docker.OWNER)));
    machine = ((org.apache.brooklyn.location.ssh.SshMachineLocation) (getConfig(brooklyn.location.docker.DockerHostLocation.MACHINE)));
    portForwarder = ((brooklyn.networking.common.subnet.PortForwarder) (getConfig(brooklyn.location.docker.DockerHostLocation.PORT_FORWARDER)));
    jcloudsLocation = ((org.apache.brooklyn.location.jclouds.JcloudsLocation) (getConfig(brooklyn.location.docker.DockerHostLocation.JCLOUDS_LOCATION)));
    if ((getConfig(brooklyn.location.docker.DockerHostLocation.LOCATION_NAME)) != null) {
        register();
    }
}