@java.lang.Override
public void readFrom(org.jboss.netty.buffer.ChannelBuffer data) {
    super.readFrom(data);
    data.readBytes(3);
    ofControllerRole = org.onosproject.floodlightpof.protocol.OFControllerRole.values()[data.readByte()];
}