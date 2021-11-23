@java.lang.Override
public boolean exists(nl.esciencecenter.xenon.filesystems.Path path) throws nl.esciencecenter.xenon.XenonException {
    java.lang.System.out.println(("EXISTS: " + path));
    path = toAbsolutePath(path);
    java.lang.System.out.println(("EXISTS ABS: " + path));
    try {
        return (client.exists(getDirectoryPath(path))) || (client.exists(getFilePath(path)));
    } catch (java.io.IOException e) {
        throw new nl.esciencecenter.xenon.XenonException(nl.esciencecenter.xenon.adaptors.filesystems.webdav.WebdavFileAdaptor.ADAPTOR_NAME, ("Failed to check existence of directory: " + path));
    }
}