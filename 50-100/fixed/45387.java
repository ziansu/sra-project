private java.io.InputStream serializeProfileGazelleToZip(gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.Profile profile) throws java.io.IOException {
    java.io.ByteArrayOutputStream outputStream = null;
    byte[] bytes;
    outputStream = new java.io.ByteArrayOutputStream();
    java.util.zip.ZipOutputStream out = new java.util.zip.ZipOutputStream(outputStream);
    this.generateGazelleProfileIS(out, this.serializeProfileGazelleToXML(profile));
    out.close();
    bytes = outputStream.toByteArray();
    return new java.io.ByteArrayInputStream(bytes);
}