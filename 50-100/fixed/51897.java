@org.junit.Test(timeout = 5000)
public void testRemove2_NullPointerException() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap c = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newStrStrMap()) {
        c.put("sadsdf", "asdads");
        c.remove(null, "whatever");
        shouldThrow();
    } catch (java.lang.NullPointerException success) {
    }
}