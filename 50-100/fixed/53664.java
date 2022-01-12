@org.testng.annotations.Test
public void nullInput() {
    com.yahoo.sketches.frequencies.ItemsSketch<java.lang.String> sketch = new com.yahoo.sketches.frequencies.ItemsSketch((1 << (com.yahoo.sketches.frequencies.Util.LG_MIN_MAP_SIZE)));
    sketch.update(null);
    org.testng.Assert.assertTrue(sketch.isEmpty());
    org.testng.Assert.assertEquals(sketch.getNumActiveItems(), 0);
    org.testng.Assert.assertEquals(sketch.getStreamLength(), 0);
    org.testng.Assert.assertEquals(sketch.getLowerBound(null), 0);
    org.testng.Assert.assertEquals(sketch.getUpperBound(null), 0);
}