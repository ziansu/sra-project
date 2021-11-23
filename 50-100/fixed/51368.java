protected java.io.InputStream getInputStream(java.net.HttpURLConnection connection) {
    java.io.InputStream result;
    try {
        java.io.InputStream inputStream = connection.getInputStream();
        connection.connect();
        if ("gzip".equals(connection.getContentEncoding())) {
            inputStream = new java.util.zip.GZIPInputStream(inputStream);
        }
        result = inputStream;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        result = null;
    }
    return result;
}