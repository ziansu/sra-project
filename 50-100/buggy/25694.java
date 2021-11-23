@org.junit.Test
public void testStoreBinary() throws java.lang.Exception {
    lux.index.XmlIndexer indexer = new lux.index.XmlIndexer(STORE_DOCUMENT);
    org.apache.lucene.index.IndexWriter indexWriter = indexer.newIndexWriter(dir);
    indexer.storeDocument(indexWriter, "/lux/compiler/test-module.xqy", getClass().getClassLoader().getResourceAsStream("lux/compiler/test-module.xqy"));
    indexWriter.close();
    java.lang.System.out.println(java.lang.String.format("indexed path-values for test-module.xqy in %d bytes", dir.sizeInBytes()));
}