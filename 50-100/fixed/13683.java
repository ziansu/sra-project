public static java.io.File createAsnBerFile(int pduCount, byte[] pdu) throws java.io.IOException {
    final java.io.File berFile = java.io.File.createTempFile(com.brightsparklabs.asanti.mocks.MockAsnBerFile.class.getSimpleName(), ".ber");
    berFile.deleteOnExit();
    final com.google.common.io.ByteSink sink = com.google.common.io.Files.asByteSink(berFile, com.google.common.io.FileWriteMode.APPEND);
    for (int i = 0; i < pduCount; i++) {
        sink.write(pdu);
    }
    return berFile;
}