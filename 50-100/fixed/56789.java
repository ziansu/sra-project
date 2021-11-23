private void updateCertificate(com.axelor.apps.bankpayment.db.EbicsCertificate cert) {
    if (cert == null) {
        return ;
    }
    java.lang.String pem = cert.getPemString();
    if (pem == null) {
        return ;
    }
    try {
        java.security.cert.X509Certificate certificate = certificateService.convertToCertificate(pem);
        certificateService.updateCertificate(certificate, cert, false);
    } catch (java.io.IOException | java.security.cert.CertificateEncodingException e) {
        e.printStackTrace();
    }
}