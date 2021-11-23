@org.junit.Test
public void testIndexImporterWithWrongRowIdShardCombination() throws java.io.IOException {
    java.util.List<org.apache.lucene.document.Field> document = _fieldManager.getFields("2", genRecord("1"));
    _commitWriter.addDocument(document);
    _commitWriter.commit();
    _commitWriter.close();
    _indexImporter.run();
    org.junit.Assert.assertFalse(_fileSystem.exists(_path));
    org.junit.Assert.assertTrue(_fileSystem.exists(_badRowIdsPath));
    org.junit.Assert.assertFalse(_fileSystem.exists(_inUsePath));
    validateIndex();
}