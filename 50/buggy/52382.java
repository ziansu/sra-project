@org.junit.Test
public void testMultipleInputsAndOutputsWithIterator() {
    org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iter = new org.nd4j.linalg.dataset.api.iterator.TestMultiDataSetIterator(data, 5);
    SUT.fit(iter);
    assertExpectedMeanStd();
}