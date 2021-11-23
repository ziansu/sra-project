@org.junit.Test(timeout = 5000)
public void testReplace2_NullPointerException() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap c = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newShmIntString()) {
        c.replace(notPresent, null);
        shouldThrow();
    } catch (java.lang.NullPointerException success) {
    }
}