@java.lang.Override
public java.lang.Object getObject() throws java.lang.Exception {
    return new org.springframework.core.io.FileSystemResource((((systemVariables.getAutoLoadIndexLocation()) + (java.io.File.separator)) + (indexName)));
}