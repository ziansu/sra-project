@org.junit.Test(timeout = 10000)
public void testKeySet() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5()) {
        java.util.Set s = map.keySet();
        assertEquals(5, s.size());
        assertTrue(s.contains(one));
        assertTrue(s.contains(two));
        assertTrue(s.contains(three));
        assertTrue(s.contains(four));
        assertTrue(s.contains(five));
    }
}