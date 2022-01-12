@java.lang.Override
public nl.esciencecenter.xenon.filesystems.Path getExpectedWorkingDirectory() {
    java.lang.String baseDir = null;
    try {
        baseDir = nl.esciencecenter.xenon.utils.LocalFileSystemUtils.getLocalRootlessPath(java.lang.System.getProperty("user.dir"));
    } catch (nl.esciencecenter.xenon.InvalidLocationException e) {
        e.printStackTrace();
    }
    if (baseDir == null) {
        throw new java.lang.RuntimeException("User dir property not set so current working directory not known!");
    }
    char sep = nl.esciencecenter.xenon.filesystems.Path.DEFAULT_SEPARATOR;
    if ((java.lang.System.getProperty("xenon.separator")) != null) {
        sep = java.lang.System.getProperty("xenon.separator").charAt(0);
    }
    return new nl.esciencecenter.xenon.filesystems.Path(sep, baseDir);
}