@java.lang.Override
public void close() throws java.io.IOException {
    org.rascalmpl.uri.libraries.InMemoryResolver.File file = get(uri);
    byte[] content = this.toByteArray();
    if (file == null) {
        if ((content.length) == 0) {
            super.close();
            return ;
        }
        file = new org.rascalmpl.uri.libraries.InMemoryResolver.File();
        fileSystem.getFileSystem().put(uri.getPath(), file);
    }
    file.newContent(content);
    super.close();
}