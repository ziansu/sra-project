@org.junit.Test
public void testIndexFullTextOneDoc() throws java.lang.Exception {
    lux.index.XmlIndexer indexer = new lux.index.XmlIndexer(INDEX_FULLTEXT);
    org.apache.lucene.index.IndexWriter indexWriter = indexer.newIndexWriter(dir);
    indexer.indexDocument(indexWriter, "/lux/reader-test.xml", getClass().getClassLoader().getResourceAsStream("lux/reader-test.xml"));
    indexWriter.close();
    lux.IndexTestSupport.printAllTerms(dir, indexer);
}