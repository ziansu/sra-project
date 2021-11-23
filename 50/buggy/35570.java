@java.lang.Override
public java.io.File getCanonicalFile() throws java.io.IOException {
    return (canonicalFile) != null ? canonicalFile : (canonicalFile = new net.filebot.util.FastFile(super.getCanonicalFile()));
}