@org.junit.Test
@org.junit.Ignore
public void testIndexPathValuesOneDoc() throws java.lang.Exception {
    lux.index.XmlIndexer indexer = new lux.index.XmlIndexer(((INDEX_PATHS) | (INDEX_VALUES)));
    org.apache.lucene.index.IndexWriter indexWriter = indexer.newIndexWriter(dir);
    indexer.indexDocument(indexWriter, "/lux/hamlet.xml", getClass().getClassLoader().getResourceAsStream("lux/hamlet.xml"));
    indexWriter.close();
}