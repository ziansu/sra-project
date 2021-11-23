@org.junit.Test(timeout = 10000)
public void testContainsKey() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5()) {
        assertTrue(map.containsKey(one));
        assertFalse(map.containsKey(zero));
    }
}