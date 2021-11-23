@org.junit.Test
public void compareTest() {
    final java.util.Comparator<java.net.SocketAddress> socketAddressComparator = limit.socketAddressComparator();
    org.junit.Assert.assertEquals(expected, socketAddressComparator.compare(compareFirst, compareSecond));
    org.junit.Assert.assertEquals((-(expected)), socketAddressComparator.compare(compareSecond, compareFirst));
}