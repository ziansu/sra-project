private nl.esciencecenter.xenon.adaptors.filesystems.Path createNewTestFileName(nl.esciencecenter.xenon.adaptors.filesystems.Path root) throws java.lang.Exception {
    nl.esciencecenter.xenon.adaptors.filesystems.Path file = root.resolve(("file" + (nl.esciencecenter.xenon.adaptors.filesystems.FileSystemTestParent.getNextCounter())));
    org.junit.Assert.assertFalse(("Generated NEW test file already exists! " + file), fileSystem.exists(file));
    return file;
}