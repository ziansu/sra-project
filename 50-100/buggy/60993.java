private void invokeSendPacket(java.lang.Object packet) {
    try {
        if ((player) instanceof net.sf.cglib.proxy.Factory) {
            com.comphenix.protocol.utility.MinecraftMethods.getNetworkManagerHandleMethod().invoke(networkManager, packet, new io.netty.util.concurrent.GenericFutureListener[0]);
        }else {
            com.comphenix.protocol.utility.MinecraftMethods.getSendPacketMethod().invoke(getPlayerConnection(), packet);
        }
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(("Unable to send server packet " + packet), e);
    }
}