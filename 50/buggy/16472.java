private static javax.crypto.spec.IvParameterSpec getIv(byte[] ivSrc) {
    return new javax.crypto.spec.IvParameterSpec(ivSrc, ((ivSrc.length) - (org.firefli.accountkeeper.security.EncryptionManager.IV_LENGTH)), org.firefli.accountkeeper.security.EncryptionManager.IV_LENGTH);
}