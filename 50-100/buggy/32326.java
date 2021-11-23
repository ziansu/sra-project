@java.lang.Override
public final br.com.xavier.io.transform.stream.interfaces.StreamTransformResult<T> transform(java.io.InputStream inputStream) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    org.apache.commons.codec.binary.Base64OutputStream base64OutputStream = new org.apache.commons.codec.binary.Base64OutputStream(baos);
    org.apache.commons.io.IOUtils.copy(inputStream, base64OutputStream, bufferSize);
    byte[] base64Bytes = baos.toByteArray();
    return doTransform(base64Bytes);
}