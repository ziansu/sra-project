public static byte[] gzipCompress(byte[] byteArray) throws java.io.IOException {
    java.io.ByteArrayOutputStream byteStream = new java.io.ByteArrayOutputStream(byteArray.length);
    try {
        java.util.zip.GZIPOutputStream zipStream = new java.util.zip.GZIPOutputStream(byteStream);
        try {
            zipStream.write(byteArray);
        } finally {
            zipStream.close();
        }
    } finally {
        byteStream.close();
    }
    byte[] compressedData = byteStream.toByteArray();
    return compressedData;
}