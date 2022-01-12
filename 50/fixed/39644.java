public void checkClientTrusted(@javax.annotation.Nonnull
@com.helger.commons.annotation.Nonempty
final java.security.cert.X509Certificate[] aChain, final java.lang.String sAuthType) throws java.security.cert.CertificateException {
    if (com.helger.peppol.lime.api.cert.AccessPointX509TrustManager.s_aLogger.isDebugEnabled())
        com.helger.peppol.lime.api.cert.AccessPointX509TrustManager.s_aLogger.debug("Checking client certificates.");
    
    _check(aChain);
}