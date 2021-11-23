private static void initialize() {
    if (com.comphenix.protocol.injector.packet.PacketRegistry.INITIALIZED) {
        if ((com.comphenix.protocol.injector.packet.PacketRegistry.NETTY) == null) {
            throw new java.lang.IllegalStateException("Failed to initialize packet registry.");
        }
        return ;
    }
    com.comphenix.protocol.injector.packet.PacketRegistry.NETTY = new com.comphenix.protocol.injector.netty.NettyProtocolRegistry();
    com.comphenix.protocol.injector.packet.PacketRegistry.INITIALIZED = true;
}