private byte[] createZippedPassAndReturnAsByteArray(final java.io.File tempPassDir) throws de.brendamour.jpasskit.signing.PKSigningException {
    java.io.ByteArrayOutputStream byteArrayOutputStreamForZippedPass = new java.io.ByteArrayOutputStream();
    try (java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(byteArrayOutputStreamForZippedPass)) {
        zip(tempPassDir, tempPassDir, zipOutputStream);
        return byteArrayOutputStreamForZippedPass.toByteArray();
    } catch (java.io.IOException e) {
        throw new de.brendamour.jpasskit.signing.PKSigningException("Error while creating a zip package", e);
    }
}