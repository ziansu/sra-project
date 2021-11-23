public static org.apache.cxf.rs.security.jose.jwe.KeyEncryptionProvider getPublicKeyEncryptionProvider(java.security.PublicKey key, org.apache.cxf.rs.security.jose.jwa.KeyAlgorithm algo) {
    if (key instanceof java.security.interfaces.RSAPublicKey) {
        return new org.apache.cxf.rs.security.jose.jwe.RSAKeyEncryptionAlgorithm(((java.security.interfaces.RSAPublicKey) (key)), algo);
    }else
        if (key instanceof java.security.interfaces.ECPublicKey) {
            return new org.apache.cxf.rs.security.jose.jwe.EcdhAesWrapKeyEncryptionAlgorithm(((java.security.interfaces.ECPublicKey) (key)), algo);
        }
    
    return null;
}