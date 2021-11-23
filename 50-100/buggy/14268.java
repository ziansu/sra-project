private java.security.PublicKey readPublicKeyFile() {
    try {
        byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(Constants.PUBLIC_KEY_FILE_NAME));
        java.security.spec.X509EncodedKeySpec spec = new java.security.spec.X509EncodedKeySpec(data);
        java.security.KeyFactory kf = java.security.KeyFactory.getInstance(Constants.ALGORITHM);
        return kf.generatePublic(spec);
    } catch (java.io.IOException | java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException ex) {
        nl.nossa.application3.SignedChecker.logger.log(java.util.logging.Level.SEVERE, "En error occured while reading the public key file.", ex);
    }
    return null;
}