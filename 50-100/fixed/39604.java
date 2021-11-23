private void readFileTree() {
    java.io.InputStream in = proxysf.FileSystemExecutor.class.getClassLoader().getResourceAsStream(proxysf.FileSystemExecutor.FILE_TREE_FILE_NAME);
    java.lang.String fileTree = null;
    try {
        fileTree = org.apache.commons.io.IOUtils.toString(in, "UTF-8");
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException("Conversion of file input stream to string failed");
    }
    java.lang.System.out.println(("read file tree = " + fileTree));
    fileTree = fileTree.substring(1, ((fileTree.length()) - 1));
    createFileTree(fileTree);
}