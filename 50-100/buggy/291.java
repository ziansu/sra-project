private byte[] parseSave(com.woernerj.dragonsdogma.bo.DDSaveHeader header, java.io.InputStream saveStream) {
    byte[] compressedData = new byte[header.getCompressedSize()];
    java.lang.Integer length = (header.getCompressedSize()) - (com.woernerj.dragonsdogma.bo.DDSaveHeader.HEADER_BYTES);
    java.lang.Integer readBytes = -1;
    try {
        readBytes = saveStream.read(compressedData, 0, length);
    } catch (java.io.IOException e) {
        return null;
    }
    if (readBytes < 0)
        return null;
    
    return com.woernerj.dragonsdogma.util.CompressionUtils.decompress(compressedData);
}