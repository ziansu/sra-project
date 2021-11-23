@org.junit.Test
public void testIndexImporterWithWrongRowIdShardCombination() throws java.io.IOException {
    java.util.List<org.apache.lucene.document.Field> document = _fieldManager.getFields("2", genRecord("1"));
    _commitWriter.addDocument(document);
    _commitWriter.commit();
    _commitWriter.close();
    _indexImporter.run();
    assertFalse(_fileSystem.exists(_path));
    assertTrue(_fileSystem.exists(_badRowIdsPath));
    assertFalse(_fileSystem.exists(_inUsePath));
    validateIndex();
}