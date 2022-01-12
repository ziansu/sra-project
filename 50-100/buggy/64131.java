@org.junit.Test
public void forJavaName_fromLegacyEnumName() {
    org.junit.Assert.assertNotEquals(okhttp3.CipherSuite.forJavaName("TLS_RSA_EXPORT_WITH_RC4_40_MD5"), okhttp3.CipherSuite.forJavaName("SSL_RSA_EXPORT_WITH_RC4_40_MD5"));
    org.junit.Assert.assertNotEquals(okhttp3.CipherSuite.forJavaName("TLS_DH_RSA_EXPORT_WITH_DES40_CBC_SHA"), okhttp3.CipherSuite.forJavaName("SSL_DH_RSA_EXPORT_WITH_DES40_CBC_SHA"));
    org.junit.Assert.assertNotEquals(okhttp3.CipherSuite.forJavaName("TLS_FAKE_NEW_CIPHER"), okhttp3.CipherSuite.forJavaName("SSL_FAKE_NEW_CIPHER"));
}