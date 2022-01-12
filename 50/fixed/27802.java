@org.junit.Test
public void testHasPrevious() {
    assertFalse(Ipv6.FIRST_IPV6_ADDRESS.hasPrevious());
    assertTrue(net.ripe.commons.ip.Ipv6.of("1:2:3:4:5:6:7:8").hasPrevious());
    assertTrue(Ipv6.LAST_IPV6_ADDRESS.hasPrevious());
}