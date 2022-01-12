public static final long readUnsignedInt(java.io.InputStream inputStream) throws java.io.IOException {
    int[] octets = de.ralleytn.utils.IOUtils.read(inputStream, 4);
    return de.ralleytn.utils.BinaryUtils.getUnsignedInteger(octets[3], octets[2], octets[1], octets[0]);
}