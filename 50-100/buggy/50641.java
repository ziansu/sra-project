public static final int readSignedInt(java.io.InputStream inputStream) throws java.io.IOException {
    int[] octets = de.ralleytn.utils.IOUtils.read(inputStream, 4);
    return de.ralleytn.utils.BinaryUtils.getSignedInteger(octets[0], octets[1], octets[2], octets[3]);
}