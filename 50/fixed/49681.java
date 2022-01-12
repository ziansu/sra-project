@java.lang.Override
public java.io.File createTempDirectory(java.io.File baseDir) {
    return createTempDirectory(baseDir, interactivespaces.util.io.FileSupportImpl.TEMP_FILE_PREFIX);
}