private void copyStream(com.sun.grizzly.tcp.http11.GrizzlyResponse grizzlyResponse, java.io.InputStream is) throws java.io.IOException {
    java.io.OutputStream os = grizzlyResponse.getOutputStream();
    try {
        org.apache.commons.io.IOUtils.copyLarge(is, os);
        os.flush();
    } finally {
        is.close();
    }
}