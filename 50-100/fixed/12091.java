private void adaptPortBindingToParallelRun(org.arquillian.cube.docker.impl.client.config.CubeContainer cubeContainer) {
    final java.util.Collection<org.arquillian.cube.docker.impl.client.config.PortBinding> portBindings = cubeContainer.getPortBindings();
    if (portBindings == null) {
        return ;
    }
    for (org.arquillian.cube.docker.impl.client.config.PortBinding portBinding : portBindings) {
        final int randomPrivatePort = generateRandomPrivatePort();
        portBinding.setBound(randomPrivatePort);
    }
}