@java.lang.Override
public void afterPropertiesSet() throws java.lang.Exception {
    this.baseDirectory = new java.io.File(fileSinkProperties.getBaseDirectory());
    if (!(baseDirectory.isDirectory())) {
        if (!(this.baseDirectory.mkdirs())) {
            throw new java.lang.IllegalStateException(("Cannot create base directory " + (fileSinkProperties.getBaseDirectory())));
        }
    }
}