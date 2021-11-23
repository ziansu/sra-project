private static java.util.HashMap<java.security.Principal, org.pki.util.Certificate> getCertificateStore(java.lang.String trustedCertsDir) throws java.lang.Exception {
    java.util.HashMap<java.security.Principal, org.pki.util.Certificate> certificateStore = new java.util.HashMap<java.security.Principal, org.pki.util.Certificate>();
    for (java.io.File file : new java.io.File(trustedCertsDir).listFiles()) {
        org.pki.util.Certificate certificate = new org.pki.util.Certificate(file);
        certificateStore.put(certificate.getSubject(), certificate);
    }
    return certificateStore;
}