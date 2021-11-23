@java.lang.Override
public java.io.OutputStream openOutput(java.net.URL url) throws java.io.IOException {
    java.io.OutputStream os;
    if ("file".equalsIgnoreCase(url.getProtocol())) {
        os = new java.io.FileOutputStream(url.getFile(), true);
    }else {
        java.net.URLConnection conn = openUrlConnection(url);
        conn.setConnectTimeout(getTimeout());
        os = conn.getOutputStream();
    }
    java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(os);
    return bos;
}