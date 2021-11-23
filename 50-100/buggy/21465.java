@java.lang.Override
void processOFHello(org.projectfloodlight.openflow.protocol.OFHello m) throws java.io.IOException {
    org.projectfloodlight.openflow.protocol.OFVersion version = m.getVersion();
    factory = org.projectfloodlight.openflow.protocol.OFFactories.getFactory(version);
    net.floodlightcontroller.core.internal.OFMessageDecoder decoder = pipeline.get(net.floodlightcontroller.core.internal.OFMessageDecoder.class);
    decoder.setVersion(version);
    setState(new net.floodlightcontroller.core.internal.OFChannelHandler.WaitFeaturesReplyState());
}