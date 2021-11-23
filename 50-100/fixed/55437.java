private void createPacketCommunicator() throws java.io.IOException {
    if (useNetworking.get()) {
        try {
            packetCommunicator = us.ihmc.communication.packetCommunicator.PacketCommunicator.createTCPPacketCommunicatorServer(NetworkPorts.CONTROLLER_PORT, netClassList.get());
            packetCommunicator.connect();
        } catch (java.net.BindException bindException) {
            us.ihmc.tools.io.printing.PrintTools.error(this, bindException.getMessage());
            us.ihmc.tools.io.printing.PrintTools.warn(this, "Continuing without networking");
            useNetworking.set(false);
        }
    }
}