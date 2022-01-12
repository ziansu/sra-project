@org.testng.annotations.Test
public void testEqual() {
    com.loic.algo.common.Point p = new com.loic.algo.common.Point(12, 23);
    org.testng.Assert.assertEquals(p, new com.loic.algo.common.Point(12, 23));
    org.testng.Assert.assertEquals(p.hashCode(), new com.loic.algo.common.Point(12, 23).hashCode(), 0);
    org.testng.Assert.assertEquals(p.toString(), new com.loic.algo.common.Point(12, 23).toString());
}