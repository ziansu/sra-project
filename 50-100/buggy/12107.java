@java.lang.Override
public java.io.InputStream newInputStream(nl.esciencecenter.xenon.files.Path path) throws nl.esciencecenter.xenon.XenonException {
    java.lang.String filePath = toFilePath(path.toString());
    assertRegularFileExists(path);
    org.apache.commons.httpclient.HttpClient client = getFileSystemByPath(path);
    org.apache.commons.httpclient.methods.GetMethod method = new org.apache.commons.httpclient.methods.GetMethod(filePath);
    try {
        client.executeMethod(method);
        java.io.InputStream stream = method.getResponseBodyAsStream();
        return stream;
    } catch (java.io.IOException e) {
        throw new nl.esciencecenter.xenon.XenonException(adaptor.getName(), ("Could not open inputstream to " + filePath), e);
    }
}