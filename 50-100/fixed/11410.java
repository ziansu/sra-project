@org.testng.annotations.Test
public void serializeStringDeserializeEmpty() {
    com.yahoo.sketches.frequencies.ItemsSketch<java.lang.String> sketch1 = new com.yahoo.sketches.frequencies.ItemsSketch((1 << (com.yahoo.sketches.frequencies.Util.LG_MIN_MAP_SIZE)));
    byte[] bytes = sketch1.toByteArray(new com.yahoo.sketches.ArrayOfStringsSerDe());
    com.yahoo.sketches.frequencies.ItemsSketch<java.lang.String> sketch2 = com.yahoo.sketches.frequencies.ItemsSketch.getInstance(com.yahoo.memory.Memory.wrap(bytes), new com.yahoo.sketches.ArrayOfStringsSerDe());
    org.testng.Assert.assertTrue(sketch2.isEmpty());
    org.testng.Assert.assertEquals(sketch2.getNumActiveItems(), 0);
    org.testng.Assert.assertEquals(sketch2.getStreamLength(), 0);
}