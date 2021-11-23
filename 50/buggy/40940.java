@org.junit.Test(timeout = 5000)
public void testPutIfAbsent1_NullPointerException() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap c = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newShmIntString(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
        c.putIfAbsent(null, "whatever");
        shouldThrow();
    } catch (java.lang.NullPointerException success) {
    }
}