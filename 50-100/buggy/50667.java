public void checkClientTrusted(java.security.cert.X509Certificate[] chain, java.lang.String authType) throws java.security.cert.CertificateException {
    try {
        pkixTrustManager.checkClientTrusted(chain, authType);
    } catch (java.security.cert.CertificateException ex) {
        logger.error(("Problem with Trusted Store and Client certififcate check: " + (ex.getMessage())), ex);
    }
}