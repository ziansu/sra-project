@org.junit.Test
public void testCRAMOutput() throws java.lang.Exception {
    final org.apache.hadoop.fs.Path outputPath = doMapReduce(testCRAMFileName);
    final java.io.File containerStreamFile = new java.io.File(new java.io.File(outputPath.toUri()), "part-m-00000");
    final int actualCount = verifyCRAMContainerStream(containerStreamFile, samFileHeader, testReferenceSource);
    org.junit.Assert.assertEquals(expectedRecordCount, actualCount);
}