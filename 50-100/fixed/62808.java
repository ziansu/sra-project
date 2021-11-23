@org.junit.Test(timeout = 15000)
public void testSize2() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5()) {
        try (net.openhft.chronicle.map.ChronicleMap empty = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newShmIntString()) {
            assertEquals(0, empty.size());
            assertEquals(5, map.size());
        }
    }
}