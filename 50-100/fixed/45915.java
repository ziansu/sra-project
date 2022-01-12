public static org.apache.cxf.rs.security.jose.jwe.KeyDecryptionProvider getPrivateKeyDecryptionProvider(java.security.PrivateKey key, org.apache.cxf.rs.security.jose.jwa.KeyAlgorithm algo) {
    if (key instanceof java.security.interfaces.RSAPrivateKey) {
        return new org.apache.cxf.rs.security.jose.jwe.RSAKeyDecryptionAlgorithm(((java.security.interfaces.RSAPrivateKey) (key)), algo);
    }else
        if (key instanceof java.security.interfaces.ECPrivateKey) {
            return new org.apache.cxf.rs.security.jose.jwe.EcdhAesWrapKeyDecryptionAlgorithm(((java.security.interfaces.ECPrivateKey) (key)), algo);
        }
    
    return null;
}