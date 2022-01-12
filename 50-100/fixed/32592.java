@org.junit.Test
public void testDetectChangeConnInvalidLive() {
    graph.setConnectionData(NW, SW, com.github.rinde.rinsim.geom.LengthData.create(2.0));
    boolean fail = false;
    try {
        graph.setConnectionData(NW, SW, com.github.rinde.rinsim.geom.LengthData.create(1.99));
    } catch (final java.lang.IllegalArgumentException e) {
        fail = true;
    }
    org.junit.Assert.assertTrue(fail);
}