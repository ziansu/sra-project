@org.junit.Test(timeout = 10000)
public void testGet() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5()) {
        assertEquals("A", ((java.lang.String) (map.get(one))));
        try (net.openhft.chronicle.map.ChronicleMap empty = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newStrStrMap()) {
            assertNull(map.get(notPresent));
        }
    }
}