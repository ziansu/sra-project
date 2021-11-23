@java.lang.Override
public void incomingPacket(org.jitsi.impl.neomedia.rtp.remotebitrateestimator.RawPacket packet) {
    int extensionID = this.extensionID;
    if (extensionID == (-1)) {
        return ;
    }
    long ast = org.jitsi.impl.neomedia.rtp.remotebitrateestimator.AbsSendTimeEngine.getAbsSendTime(packet, ((byte) (extensionID)));
    if (ast != (-1)) {
        incomingPacketInfo(java.lang.System.currentTimeMillis(), ast, packet.getPayloadLength(), packet.getSSRCAsLong());
    }
}