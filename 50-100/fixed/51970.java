@org.junit.Test(timeout = 5000)
public void testToString() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5()) {
        java.lang.String s = map.toString();
        for (int i = 1; i <= 5; ++i) {
            assertTrue(s.contains(java.lang.String.valueOf(i)));
        }
    }
}