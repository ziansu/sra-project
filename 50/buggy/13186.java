@org.junit.Test
public void testRecordResultCompute() {
    int nbDup = 0;
    for (java.lang.String[][] wrs : org.talend.dataquality.standardization.record.SynonymRecordSearcherTest.WORDRESULTS) {
        printLineToConsole(" ###    Testing #### ");
        nbDup += testRecordResultCompute(wrs);
    }
    org.junit.Assert.assertEquals("last wordResult array should contain duplicates", 1, nbDup);
}