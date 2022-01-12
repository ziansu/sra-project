private static byte[] GZIPcompress(java.lang.String str) throws java.lang.Exception {
    java.io.ByteArrayOutputStream obj = new java.io.ByteArrayOutputStream();
    java.util.zip.GZIPOutputStream gzip = new java.util.zip.GZIPOutputStream(obj);
    gzip.write(str.getBytes("UTF-8"));
    gzip.close();
    return obj.toByteArray();
}