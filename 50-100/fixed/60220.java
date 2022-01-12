@org.junit.Test
public void testInsertDocuments() throws java.lang.Exception {
    printLineToConsole("\n---------------Test insertDocuments--------------");
    org.talend.dataquality.standardization.index.SynonymIndexBuilder builder = createNewIndexBuilder(org.talend.dataquality.standardization.index.SynonymIndexBuilderTest.path);
    insertDocuments(builder);
    org.talend.dataquality.standardization.index.SynonymIndexSearcher searcher = getSearcher(builder);
    assertEquals(org.talend.dataquality.standardization.index.SynonymIndexBuilderTest.synonyms.length, searcher.getNumDocs());
    builder.closeIndex();
    searcher.close();
}