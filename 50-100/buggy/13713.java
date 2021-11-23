@java.lang.SuppressWarnings(value = "unchecked")
static org.bouncycastle.tsp.TimeStampToken addSignerCertificate(org.bouncycastle.tsp.TimeStampResponse tsResponse, java.security.cert.X509Certificate signerCertificate) throws java.lang.Exception {
    org.bouncycastle.cms.CMSSignedData cms = tsResponse.getTimeStampToken().toCMSSignedData();
    java.util.List<java.security.cert.X509Certificate> collection = java.util.Collections.singletonList(signerCertificate);
    collection.addAll(cms.getCertificates().getMatches(null));
    return new org.bouncycastle.tsp.TimeStampToken(org.bouncycastle.cms.CMSSignedData.replaceCertificatesAndCRLs(cms, new org.bouncycastle.cert.jcajce.JcaCertStore(collection), cms.getAttributeCertificates(), cms.getCRLs()));
}