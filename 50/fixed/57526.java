private java.util.Collection<T> loadFiles() {
    final java.lang.String directory = getFileDirectory();
    final java.lang.String postfix = getFileExtension();
    return fileRepositorySupport.load(entityClass, directory, postfix);
}