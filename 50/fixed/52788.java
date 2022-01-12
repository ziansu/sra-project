public byte readBinaryByte() throws net.rpgtoolkit.common.CorruptAssetException {
    try {
        return ((byte) (inputStream.read()));
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.toString());
        return 0;
    }
}