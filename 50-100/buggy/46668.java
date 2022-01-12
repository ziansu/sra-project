@org.junit.Test
public void testIndexFullTextOneDoc() throws java.lang.Exception {
    lux.index.XmlIndexer indexer = new lux.index.XmlIndexer(INDEX_FULLTEXT);
    org.apache.lucene.index.IndexWriter indexWriter = indexer.newIndexWriter(dir);
    indexer.indexDocument(indexWriter, "/lux/reader-test.xml", getClass().getClassLoader().getResourceAsStream("lux/reader-test.xml"));
    indexWriter.close();
    java.lang.System.out.println(java.lang.String.format("indexed path-values for lux/reader-test.xml in %d bytes", dir.sizeInBytes()));
    lux.IndexTestSupport.printAllTerms(dir, indexer);
}