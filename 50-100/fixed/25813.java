@javax.annotation.PostConstruct
private void initEncryption() throws com.alliander.osgp.shared.exceptionhandling.FunctionalException {
    try {
        this.key = new javax.crypto.spec.SecretKeySpec(java.nio.file.Files.readAllBytes(new java.io.File(this.keyPath).toPath()), com.alliander.osgp.shared.security.EncryptionService.SECRET_KEY_SPEC);
    } catch (final java.io.IOException e) {
        com.alliander.osgp.shared.security.EncryptionService.LOGGER.error("Unexpected exception when reading keys", e);
        throw new com.alliander.osgp.shared.exceptionhandling.FunctionalException(com.alliander.osgp.shared.exceptionhandling.FunctionalExceptionType.READING_KEY_EXCEPTION, com.alliander.osgp.shared.exceptionhandling.ComponentType.SHARED, e);
    }
}