@org.junit.Test(timeout = 5000)
public void testRemove3() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap c = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newStrStrMap()) {
        c.put("sadsdf", "asdads");
        assertFalse(c.remove("sadsdf", null));
    }
}