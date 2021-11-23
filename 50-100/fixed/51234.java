protected void setPorts() {
    java.util.List<com.netcracker.providers.PortDescription> ports = new java.util.LinkedList<>();
    for (int i = 1; i <= (com.netcracker.providers.TestTopologyProvider.NUMBER_OF_PORTS); i++)
        ports.add(new com.netcracker.providers.DefaultPortDescription(com.netcracker.providers.PortNumber.portNumber(i), true));
    
    for (com.netcracker.providers.DeviceId id : devDesc.keySet()) {
        deviceProviderService.updatePorts(id, ports);
        devPort.put(id, ports);
    }
}