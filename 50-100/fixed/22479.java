@org.junit.Test
public void deleteIndexFromFS() throws java.io.IOException {
    printLineToConsole("\n---------------Test deleteIndexFromFS----------");
    java.lang.String indexPath = "data/index2";
    org.talend.dataquality.standardization.index.SynonymIndexBuilder synonymIndexBuilder = new org.talend.dataquality.standardization.index.SynonymIndexBuilder();
    synonymIndexBuilder.initIndexInFS(indexPath);
    java.io.File indexfile = new java.io.File(indexPath);
    assertEquals(true, indexfile.exists());
    synonymIndexBuilder.insertDocument("salut", "toto");
    synonymIndexBuilder.commit();
    synonymIndexBuilder.closeIndex();
    synonymIndexBuilder.deleteIndexFromFS(indexPath);
    assertEquals(false, indexfile.exists());
}