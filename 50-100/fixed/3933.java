public static void sendPacketToServer(logisticspipes.network.abstractpackets.ModernPacket packet) {
    if (logisticspipes.proxy.MainProxy.isServer()) {
        java.lang.System.err.println("sendPacketToServer called serverside !");
        new java.lang.Exception().printStackTrace();
        return ;
    }
    if (packet.isCompressable()) {
        SimpleServiceLocator.clientBufferHandler.addPacketToCompressor(packet);
    }else {
        logisticspipes.proxy.MainProxy.channels.get(Side.CLIENT).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(OutboundTarget.TOSERVER);
        logisticspipes.proxy.MainProxy.channels.get(Side.CLIENT).writeOutbound(packet);
    }
}