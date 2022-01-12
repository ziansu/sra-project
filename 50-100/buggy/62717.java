@java.lang.Override
public T store(final T object) {
    com.google.common.base.Preconditions.checkNotNull(object);
    java.lang.Object index = getIndexObject(object);
    java.io.File targetFile = getFileInformation(index);
    java.lang.String content = createFileContent(object);
    try {
        filesystemAccess.storeToFile(targetFile, content);
    } catch (java.io.IOException e) {
        throw new java.lang.IllegalStateException(e);
    }
    return object;
}