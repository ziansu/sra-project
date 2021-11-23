@org.junit.Test
public void compareTest() {
    final java.util.Comparator<java.net.SocketAddress> c = limit.socketAddressComparator();
    org.junit.Assert.assertEquals(expected, c.compare(compareFirst, compareSecond));
    org.junit.Assert.assertEquals((-(expected)), c.compare(compareSecond, compareFirst));
}