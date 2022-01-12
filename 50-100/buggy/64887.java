private static final java.nio.file.Path getCanonicalPath(final java.nio.file.Path dir) throws jp.co.gsol.oss.ical.exception.NoSuchDirectoryException {
    if (!(dir.isAbsolute()))
        throw new java.lang.IllegalArgumentException((dir + " is not abusolute path"));
    
    if (!(java.nio.file.Files.isDirectory(dir)))
        throw new jp.co.gsol.oss.ical.exception.NoSuchDirectoryException((dir + " not found"));
    
    return dir;
}