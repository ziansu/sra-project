public void testIgnoredFiles() throws java.io.IOException {
    java.io.File file = createTempFile(".svn", "");
    com.intellij.openapi.vfs.VirtualFile vFile = com.intellij.openapi.vfs.LocalFileSystem.getInstance().refreshAndFindFileByIoFile(file);
    assertTrue(com.intellij.openapi.fileTypes.impl.FileTypeManager.getInstance().isFileIgnored(vFile));
    vFile.delete(this);
    file = createTempFile("a.txt", "");
    vFile = com.intellij.openapi.vfs.LocalFileSystem.getInstance().refreshAndFindFileByIoFile(file);
    assertFalse(com.intellij.openapi.fileTypes.impl.FileTypeManager.getInstance().isFileIgnored(vFile));
}