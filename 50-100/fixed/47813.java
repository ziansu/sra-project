private com.axelor.apps.bankpayment.db.EbicsCertificate updateCertificate(java.security.cert.X509Certificate certificate, com.axelor.apps.bankpayment.db.EbicsCertificate cert, byte[] privateKey, java.lang.String type) throws java.io.IOException, java.security.cert.CertificateEncodingException {
    if (cert == null) {
        cert = new com.axelor.apps.bankpayment.db.EbicsCertificate();
        cert.setTypeSelect(type);
    }
    com.axelor.apps.bankpayment.ebics.service.EbicsCertificateService certificateService = com.axelor.inject.Beans.get(com.axelor.apps.bankpayment.ebics.service.EbicsCertificateService.class);
    cert = certificateService.updateCertificate(certificate, cert, true);
    cert.setPrivateKey(privateKey);
    return cert;
}