@org.junit.Test(timeout = 10000)
public void testKeySetToArray() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5()) {
        java.util.Set s = map.keySet();
        java.lang.Object[] ar = s.toArray();
        assertTrue(s.containsAll(java.util.Arrays.asList(ar)));
        assertEquals(5, ar.length);
        ar[0] = m10;
        assertFalse(s.containsAll(java.util.Arrays.asList(ar)));
    }
}