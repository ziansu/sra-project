@com.google.inject.persist.Transactional
public com.axelor.apps.bankpayment.db.EbicsCertificate createCertificate(java.security.cert.X509Certificate certificate, com.axelor.apps.bankpayment.db.EbicsBank bank, java.lang.String type) throws java.io.IOException, java.security.cert.CertificateEncodingException {
    com.axelor.apps.bankpayment.db.EbicsCertificate cert = com.axelor.apps.bankpayment.ebics.service.EbicsCertificateService.getEbicsCertificate(bank, type);
    if (cert == null) {
        log.debug("Creating bank certicate for bank: {}, type: {}", bank.getName(), type);
        cert = new com.axelor.apps.bankpayment.db.EbicsCertificate();
        cert.setEbicsBank(bank);
        cert.setTypeSelect(type);
    }
    cert = updateCertificate(certificate, cert, true);
    return certRepo.save(cert);
}