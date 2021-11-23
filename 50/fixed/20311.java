private void writeServerFile(java.lang.String name, java.lang.String contents) throws java.io.IOException {
    com.google.devtools.build.lib.vfs.Path file = serverDirectory.getChild(name);
    com.google.devtools.build.lib.vfs.FileSystemUtils.writeContentAsLatin1(file, contents);
    deleteAtExit(file);
}