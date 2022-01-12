@org.junit.Test
public void testIndexImporterWithBadIndex() throws java.io.IOException {
    _fileSystem.delete(_path, true);
    _fileSystem.mkdirs(_path);
    _indexImporter.run();
    assertFalse(_fileSystem.exists(_path));
    assertFalse(_fileSystem.exists(_badRowIdsPath));
    assertTrue(_fileSystem.exists(_badIndexPath));
    validateIndex();
}