@java.lang.Override
public java.io.InputStream getInputStream() throws java.io.IOException {
    return org.pac4j.core.util.CommonHelper.getInputStreamFromName(filePath);
}