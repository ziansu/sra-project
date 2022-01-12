public static java.lang.String serializeObjectToString(java.lang.Object object) throws java.lang.Exception {
    java.io.ByteArrayOutputStream arrayOutputStream = new java.io.ByteArrayOutputStream();
    java.util.zip.GZIPOutputStream gzipOutputStream = new java.util.zip.GZIPOutputStream(arrayOutputStream);
    java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(gzipOutputStream);
    objectOutputStream.writeObject(object);
    objectOutputStream.flush();
    gzipOutputStream.close();
    arrayOutputStream.close();
    objectOutputStream.close();
    java.lang.String objectString = new java.lang.String(android.util.Base64.encodeToString(arrayOutputStream.toByteArray(), Base64.DEFAULT));
    return objectString;
}