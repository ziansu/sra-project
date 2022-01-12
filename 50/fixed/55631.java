private static org.onosproject.net.flow.TrafficSelector buildTrafficSelector() {
    org.onosproject.net.flow.TrafficSelector.Builder selectorBuilder = org.onosproject.net.flow.DefaultTrafficSelector.builder();
    java.lang.Short ethType = org.onlab.packet.Ethernet.TYPE_IPV4;
    selectorBuilder.matchEthType(ethType);
    return selectorBuilder.build();
}