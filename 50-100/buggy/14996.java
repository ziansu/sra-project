@org.junit.Test
public void testVerifyAllRecordsAreAdded() throws java.lang.Exception {
    java.lang.String pathToBigRecordsFile = il.ac.technion.ie.experiments.util.ExperimentsUtils.getPathToBigRecordsFile();
    java.util.List<il.ac.technion.ie.model.Record> records = il.ac.technion.ie.experiments.util.ExperimentsUtils.createRecordsFromTestFile(pathToBigRecordsFile);
    classUnderTest = new il.ac.technion.ie.canopy.algorithm.Canopy(records, 0.3, 0.6);
    classUnderTest.initSearchEngine(canopyInteraction);
    org.mockito.Mockito.verify(canopyInteraction, org.mockito.Mockito.times(il.ac.technion.ie.canopy.algorithm.CanopyTest.NUMBER_OF_RECORDS_IN_BIG_FILE)).addDoc(org.mockito.Mockito.any(org.apache.lucene.index.IndexWriter.class), org.mockito.Mockito.anyString(), org.mockito.Mockito.anyString());
}