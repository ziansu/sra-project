@org.junit.Test
public void fromCertificate_notNull_returnsCertPLainPin() throws java.security.cert.CertificateEncodingException {
    eu.geekplace.javapinning.pin.CertPlainPin certPlainPin = eu.geekplace.javapinning.pin.Pin.fromCertificate(eu.geekplace.javapinning.util.X509CertificateUtilities.decodeX509Certificate(TestUtilities.PLAIN_CERTIFICATE_1));
    org.junit.Assert.assertNotNull(certPlainPin);
}