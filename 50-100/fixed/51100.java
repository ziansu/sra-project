@java.lang.Override
public byte[] download(java.lang.String filePath) throws com.dropbox.core.DbxException, java.io.IOException {
    byte[] out = null;
    java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
    try {
        com.dropbox.core.v1.DbxEntry.File downloadedFile = client.getFile(filePath, null, outputStream);
        logger.info(("Metadata: " + (downloadedFile.toString())));
        out = outputStream.toByteArray();
    } finally {
        outputStream.close();
    }
    return out;
}