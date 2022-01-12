private static java.lang.String readContent(java.net.HttpURLConnection httpConn) throws java.io.IOException {
    java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream(512);
    try (java.io.InputStream in = httpConn.getInputStream()) {
        org.dcm4che3.util.StreamUtils.copy(in, out);
    }
    return new java.lang.String(out.toByteArray(), org.dcm4chee.arc.store.impl.StoreServiceEJB.charsetOf(httpConn));
}