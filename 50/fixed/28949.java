@org.junit.Test(timeout = 10000)
public void testPutIfAbsent2_NullPointerException() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap c = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newShmIntString()) {
        c.putIfAbsent(notPresent, null);
        shouldThrow();
    } catch (java.lang.NullPointerException success) {
    }
}