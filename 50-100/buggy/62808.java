@org.junit.Test(timeout = 15000)
public void testSize2() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
        try (net.openhft.chronicle.map.ChronicleMap empty = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newShmIntString(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
            assertEquals(0, empty.size());
            assertEquals(5, map.size());
        }
    }
}