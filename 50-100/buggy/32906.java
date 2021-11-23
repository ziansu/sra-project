@java.lang.Override
public final java.lang.String getDestinationMacAddress() {
    if ((this.destinationMacAddress) != null) {
        return this.destinationMacAddress;
    }
    try {
        return io.pkts.packet.impl.MACPacketImpl.toHexString(this.headers, 6, 6);
    } catch (final java.io.IOException e) {
        throw new java.lang.RuntimeException("Unable to read data from the underlying Buffer.", e);
    }
}