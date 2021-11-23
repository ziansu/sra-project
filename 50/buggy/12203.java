@org.junit.Test(timeout = 5000)
public void testRemove3() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap c = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newStrStrMap(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
        c.put("sadsdf", "asdads");
        assertFalse(c.remove("sadsdf", null));
    }
}