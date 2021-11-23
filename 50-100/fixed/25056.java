@org.junit.Test
public void testIndexImporterWithCorrectRowIdShardCombination() throws java.io.IOException {
    java.util.List<org.apache.lucene.document.Field> document = _fieldManager.getFields("1", genRecord("1"));
    _commitWriter.addDocument(document);
    _commitWriter.commit();
    _commitWriter.close();
    _indexImporter.run();
    assertFalse(_fileSystem.exists(_path));
    assertFalse(_fileSystem.exists(_badRowIdsPath));
    assertTrue(_fileSystem.exists(_inUsePath));
    validateIndex();
}