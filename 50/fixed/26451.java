@org.junit.Test(timeout = 10000)
public void testClear() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap<java.lang.Integer, java.lang.String> map = map5()) {
        map.clear();
        assertEquals(0, map.size());
    }
}