private void propagateHeaders(net.ripe.hadoop.pcap.packet.HttpPacket packet, org.apache.http.Header[] headers) {
    java.util.LinkedList<java.lang.String> headerKeys = new java.util.LinkedList<java.lang.String>();
    for (org.apache.http.Header header : headers) {
        java.lang.String headerKey = (net.ripe.hadoop.pcap.HttpPcapReader.HEADER_PREFIX) + (header.getName().toLowerCase());
        packet.put(headerKey, header.getValue());
    }
    packet.put(HttpPacket.HTTP_HEADERS, com.google.common.base.Joiner.on(',').join(headerKeys));
}