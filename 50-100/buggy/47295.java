public static org.apache.cxf.rs.security.jose.jwe.KeyEncryptionProvider getPublicKeyEncryptionProvider(java.security.PublicKey key, org.apache.cxf.rs.security.jose.jwa.KeyAlgorithm algo) {
    if (key instanceof java.security.PublicKey) {
        return new org.apache.cxf.rs.security.jose.jwe.RSAKeyEncryptionAlgorithm(((java.security.interfaces.RSAPublicKey) (key)), algo);
    }else {
        return new org.apache.cxf.rs.security.jose.jwe.EcdhAesWrapKeyEncryptionAlgorithm(((java.security.interfaces.ECPublicKey) (key)), algo);
    }
}