public Protocol.Log toProtocol() {
    retroscope.net.protocol.Protocol.Log.Builder builder = super.toProtocol().toBuilder();
    if ((head) != null) {
        builder.setDataMap(retroscope.net.protocol.ProtocolHelpers.retroMapToProtocol(dataMap, this.name, head.getTime().toLong()));
    }
    return builder.build();
}