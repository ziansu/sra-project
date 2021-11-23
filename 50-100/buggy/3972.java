public void createFile(eu.domibus.plugin.fs.FileObject directory, java.lang.String fileName, java.lang.String content) throws java.io.IOException {
    try (eu.domibus.plugin.fs.FileObject file = directory.resolveFile(fileName);java.io.OutputStream fileOS = file.getContent().getOutputStream();java.io.OutputStreamWriter fileOSW = new java.io.OutputStreamWriter(fileOS)) {
        file.createFile();
        fileOSW.write(content);
    }
}