protected static byte[] compressFile(java.io.File file, int algorithm) throws java.io.IOException {
    org.bouncycastle.openpgp.PGPCompressedDataGenerator comData = new org.bouncycastle.openpgp.PGPCompressedDataGenerator(algorithm);
    java.io.ByteArrayOutputStream bOut = new java.io.ByteArrayOutputStream();
    try {
        org.bouncycastle.openpgp.PGPUtil.writeFileToLiteralData(comData.open(bOut), PGPLiteralData.BINARY, file);
    } finally {
        comData.close();
    }
    return bOut.toByteArray();
}