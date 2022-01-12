@org.junit.Test
@org.junit.experimental.categories.Category(value = org.apache.beam.sdk.testing.RunnableOnService.class)
public void testUnboundedInput() {
    org.apache.beam.sdk.Pipeline p = org.apache.beam.sdk.testing.TestPipeline.create();
    long numElements = 1000;
    org.apache.beam.sdk.values.PCollection<java.lang.Long> input = p.apply(org.apache.beam.sdk.io.CountingInput.unbounded().withMaxNumRecords(numElements));
    org.apache.beam.sdk.io.CountingInputTest.addCountingAsserts(input, 0, numElements);
    p.run();
}