@org.testng.annotations.Test
public void empty() {
    com.yahoo.sketches.frequencies.ItemsSketch<java.lang.String> sketch = new com.yahoo.sketches.frequencies.ItemsSketch((1 << (com.yahoo.sketches.frequencies.Util.LG_MIN_MAP_SIZE)));
    org.testng.Assert.assertTrue(sketch.isEmpty());
    org.testng.Assert.assertEquals(sketch.getNumActiveItems(), 0);
    org.testng.Assert.assertEquals(sketch.getStreamLength(), 0);
    org.testng.Assert.assertEquals(sketch.getLowerBound("a"), 0);
    org.testng.Assert.assertEquals(sketch.getUpperBound("a"), 0);
}