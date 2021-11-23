@java.lang.Override
public void checkClientTrusted(java.security.cert.X509Certificate[] chain, java.lang.String authType) throws java.security.cert.CertificateException {
    try {
        trustManager.checkClientTrusted(chain, authType);
    } catch (java.security.cert.CertificateException cx) {
        try {
            if (reloadTrustManager()) {
                trustManager.checkClientTrusted(chain, authType);
            }else {
                throw cx;
            }
        } catch (javax.net.ssl.SSLException e) {
            java.lang.String message = "Issue occurred while rereading trust store.";
            log.error(message, e);
            throw new java.security.cert.CertificateException(message, e);
        }
    }
}