@java.lang.Override
protected int getTypeCode() {
    return isFourByteASNumber() ? org.bgp4j.netty.BGPv4Constants.BGP_PATH_ATTRIBUTE_TYPE_AS4_AGGREGATOR : org.bgp4j.netty.BGPv4Constants.BGP_PATH_ATTRIBUTE_TYPE_AGGREGATOR;
}