@org.junit.Test
public void testIndexImporterWithBadIndex() throws java.io.IOException {
    _fileSystem.delete(_path, true);
    _fileSystem.mkdirs(_path);
    _indexImporter.run();
    org.junit.Assert.assertFalse(_fileSystem.exists(_path));
    org.junit.Assert.assertFalse(_fileSystem.exists(_badRowIdsPath));
    org.junit.Assert.assertTrue(_fileSystem.exists(_badIndexPath));
    validateIndex();
}