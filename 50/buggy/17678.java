@org.junit.Test(timeout = 5000)
public void testReplaceValue3_NullPointerException() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap c = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newShmIntString(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
        c.replace(notPresent, "A", null);
        shouldThrow();
    } catch (java.lang.NullPointerException success) {
    }
}