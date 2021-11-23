@java.lang.Override
public java.io.File extract(java.io.File destination) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
    assertState();
    org.rauschig.jarchivelib.IOUtils.requireDirectory(destination);
    java.io.File file = new java.io.File(destination, entry.getName());
    if (entry.isDirectory()) {
        file.mkdirs();
    }else {
        file.getParentFile().mkdirs();
        org.rauschig.jarchivelib.IOUtils.copy(stream, file);
    }
    org.rauschig.jarchivelib.FileModeMapper.map(entry, file);
    return file;
}