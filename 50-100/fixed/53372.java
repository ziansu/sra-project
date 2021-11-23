@java.lang.Override
public void verify(java.security.PublicKey key) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.SignatureException, java.security.cert.CertificateException {
    if (key instanceof org.conscrypt.OpenSSLKeyHolder) {
        org.conscrypt.OpenSSLKey pkey = ((org.conscrypt.OpenSSLKeyHolder) (key)).getOpenSSLKey();
        verifyOpenSSL(pkey);
        return ;
    }
    verifyInternal(key, ((java.lang.String) (null)));
}