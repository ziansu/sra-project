public com.sproutigy.commons.binary.BinaryBuilder append(java.io.InputStream inputStream) throws com.sproutigy.commons.binary.BinaryException {
    try {
        byte[] buffer = new byte[4 * 1024];
        int readlen;
        while ((readlen = inputStream.read(buffer)) != (Binary.EOF)) {
            append(buffer, 0, readlen);
        } 
    } catch (java.io.IOException e) {
        throw new com.sproutigy.commons.binary.BinaryException(e);
    }
    return this;
}