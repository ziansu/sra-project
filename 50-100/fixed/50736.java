private javax.crypto.Cipher initializeCipherBasedOnServicePublicKey(final java.security.PublicKey publicKey, final org.jasig.cas.services.RegisteredService registeredService) {
    try {
        logger.debug("Using public key [{}] to initialize the cipher", registeredService.getPublicKey());
        final javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(publicKey.getAlgorithm());
        cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, publicKey);
        logger.debug("Initialized cipher in encrypt-mode via the public key algorithm [{}]", publicKey.getAlgorithm());
        return cipher;
    } catch (final java.lang.Exception e) {
        logger.warn("Cipher could not be initialized for service [{}]. Error [{}]", registeredService, e.getMessage());
    }
    return null;
}