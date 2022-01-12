@java.lang.Override
public final java.lang.String getSourceMacAddress() {
    if ((this.sourceMacAddress) != null) {
        return this.sourceMacAddress;
    }
    try {
        return io.pkts.packet.impl.MACPacketImpl.toHexString(this.headers, 6, 6);
    } catch (final java.io.IOException e) {
        throw new java.lang.RuntimeException("Unable to read data from the underlying Buffer.", e);
    }
}