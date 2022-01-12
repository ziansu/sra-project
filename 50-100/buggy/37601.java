@org.junit.Test(timeout = 10000)
public void testIsEmpty() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap empty = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newShmIntString(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
        try (net.openhft.chronicle.map.ChronicleMap map = map5(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
            if (!(empty.isEmpty())) {
                java.lang.System.out.print(("not empty " + empty));
            }
            assertTrue(empty.isEmpty());
            assertFalse(map.isEmpty());
        }
    }
}