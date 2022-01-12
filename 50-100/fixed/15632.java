@org.junit.Test
public void testCheckCertificateValidityDisabled() throws java.lang.Exception {
    final java.security.cert.X509Certificate expiredCertificate = pkiUtil.createCertificate(java.math.BigInteger.ONE, new org.joda.time.DateTime().minusDays(2).toDate(), new org.joda.time.DateTime().minusDays(1).toDate(), null);
    new mockit.Expectations() {
        {
            domibusProperties.getProperty(TrustSenderInterceptor.DOMIBUS_SENDER_CERTIFICATE_VALIDATION_ONRECEIVING, "true");
            result = "false";
        }
    };
    org.junit.Assert.assertTrue(trustSenderInterceptor.checkCertificateValidity(expiredCertificate, "test sender", false));
}