byte[] getSignature() {
    byte[] sigBytes = null;
    try {
        byte[] hashValue = bOut.toByteArray();
        sigBytes = pkcs11Session.sign(bOut.toByteArray());
        closeSession();
    } catch (java.lang.Exception ex) {
        org.votingsystem.signature.dnie.DNIeContentSigner.log.log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
    }
    return sigBytes;
}