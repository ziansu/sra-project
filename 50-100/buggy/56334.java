private void computePublicKeyHash(ch.ge.ve.commons.properties.PropertyConfigurationService propertyConfigurationService, java.lang.String ctrlDerFilename) {
    try {
        java.io.FileInputStream ctrlDerInputStream = new java.io.FileInputStream(ctrlDerFilename);
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-1");
        byte[] keyHash = streamHasher.computeHash(ctrlDerInputStream, digest);
        ctrlDerInputStream.close();
        java.lang.String hashString = javax.xml.bind.DatatypeConverter.printHexBinary(keyHash);
        consoleOutputController.logOnScreen(java.lang.String.format(resources.getString("key_generation.public_key_hash"), hashString));
    } catch (java.security.NoSuchAlgorithmException | java.io.IOException e) {
        throw new ch.ge.ve.offlineadmin.exception.KeyGenerationRuntimeException("error while generating the public key hash", e);
    }
}