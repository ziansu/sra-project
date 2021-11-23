@org.junit.Test(timeout = 10000)
public void testReplace_NullPointerException() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap c = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newShmIntString(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
        c.replace(null, "whatever");
        shouldThrow();
    } catch (java.lang.NullPointerException success) {
    }
}