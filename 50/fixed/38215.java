public java.security.cert.X509Certificate createCertificate(java.lang.String name, java.util.Date before, java.util.Date after, java.security.PublicKey key) throws java.lang.IllegalArgumentException {
    return createCertificate(getCA_DN(), m_caKey.getPrivate(), name, before, after, key);
}