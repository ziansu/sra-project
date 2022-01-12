@org.junit.Test(expected = com.metamx.common.ISE.class)
public void testDuplicateDimensionsFirstOccurance() throws io.druid.segment.incremental.IndexSizeExceededException {
    io.druid.segment.incremental.IncrementalIndex index = indexCreator.createIndex();
    index.add(new io.druid.data.input.MapBasedInputRow(new org.joda.time.DateTime().minus(1).getMillis(), com.google.common.collect.Lists.newArrayList("billy", "joe", "joe"), com.google.common.collect.ImmutableMap.<java.lang.String, java.lang.Object>of("billy", "A", "joe", "B")));
}