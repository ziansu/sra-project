private java.lang.String getPem(java.lang.String keyTitle, byte[] encodedKey) throws java.io.IOException {
    java.io.StringWriter writer = new java.io.StringWriter();
    org.bouncycastle.util.io.pem.PemWriter pemWriter = new org.bouncycastle.util.io.pem.PemWriter(writer);
    pemWriter.writeObject(new org.bouncycastle.util.io.pem.PemObject("PUBLIC KEY", encodedKey));
    pemWriter.flush();
    pemWriter.close();
    return writer.toString();
}