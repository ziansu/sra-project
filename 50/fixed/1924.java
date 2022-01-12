public com.yumcouver.tunnel.server.protobuf.TunnelProto.TunnelCommand.Builder setDestinationIP(java.lang.String value) {
    if (value == null) {
        throw new java.lang.NullPointerException();
    }
    bitField0_ |= 64;
    destinationIP_ = value;
    onChanged();
    return this;
}