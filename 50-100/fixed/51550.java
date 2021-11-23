@org.testng.annotations.Test
public void oneItem() {
    com.yahoo.sketches.frequencies.ItemsSketch<java.lang.String> sketch = new com.yahoo.sketches.frequencies.ItemsSketch((1 << (com.yahoo.sketches.frequencies.Util.LG_MIN_MAP_SIZE)));
    sketch.update("a");
    org.testng.Assert.assertFalse(sketch.isEmpty());
    org.testng.Assert.assertEquals(sketch.getNumActiveItems(), 1);
    org.testng.Assert.assertEquals(sketch.getStreamLength(), 1);
    org.testng.Assert.assertEquals(sketch.getEstimate("a"), 1);
    org.testng.Assert.assertEquals(sketch.getLowerBound("a"), 1);
}