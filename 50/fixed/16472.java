private static javax.crypto.spec.IvParameterSpec getIv(byte[] ivSrc) {
    return new javax.crypto.spec.IvParameterSpec(ivSrc, 0, org.firefli.accountkeeper.security.EncryptionManager.IV_LENGTH);
}