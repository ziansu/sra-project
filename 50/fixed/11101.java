private java.util.Collection<org.javaswift.joss.model.DirectoryOrObject> listInternal(final java.lang.String prefix) throws java.io.IOException {
    org.javaswift.joss.model.Directory directory = new org.javaswift.joss.model.Directory(prefix, alluxio.underfs.swift.SwiftUnderFileSystem.PATH_SEPARATOR_CHAR);
    org.javaswift.joss.model.Container container = mAccount.getContainer(mContainerName);
    return container.listDirectory(directory);
}