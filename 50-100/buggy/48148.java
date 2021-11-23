@java.lang.Override
public java.io.OutputStream getBlockOS(int x, int y, int z) throws java.io.IOException {
    if ((idsStreamZip) != null) {
        return idsStreamZip;
    }
    setOrigin(x, z);
    idsStream = new com.boydti.fawe.object.io.FastByteArrayOutputStream(Settings.HISTORY.BUFFER_SIZE);
    idsStreamZip = getCompressedOS(idsStream);
    writeHeader(idsStreamZip, x, y, z);
    return idsStreamZip;
}