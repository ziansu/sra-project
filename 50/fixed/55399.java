public void add(us.myles.ViaVersion.api.protocol.Protocol protocol) {
    if ((protocolList) != null) {
        protocolList.addLast(protocol);
        protocol.init(userConnection);
    }else {
        throw new java.lang.NullPointerException("Tried to add protocol to early");
    }
}