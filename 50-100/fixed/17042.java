@org.junit.Test(timeout = 5000)
public void testReplaceValue2() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5()) {
        assertEquals("A", map.get(one));
        assertTrue(map.replace(one, "A", "Z"));
        assertEquals("Z", map.get(one));
    }
}