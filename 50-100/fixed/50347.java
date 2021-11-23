private static void validateUnicastXorMulticast(uk.co.real_logic.aeron.common.uri.AeronUri uri) {
    final boolean hasMulticastKeys = uri.containsAnyKey(uk.co.real_logic.aeron.driver.UdpChannel.MULTICAST_KEYS);
    final boolean hasUnicastKeys = uri.containsAnyKey(uk.co.real_logic.aeron.driver.UdpChannel.UNICAST_KEYS);
    if (!(hasMulticastKeys ^ hasUnicastKeys)) {
        final java.lang.String msg = "URI must contain either a unicast configuration (%s) or a multicast configuration (%s) not both";
        throw new java.lang.IllegalArgumentException(java.lang.String.format(msg, java.util.Arrays.toString(uk.co.real_logic.aeron.driver.UdpChannel.UNICAST_KEYS), java.util.Arrays.toString(uk.co.real_logic.aeron.driver.UdpChannel.MULTICAST_KEYS)));
    }
}