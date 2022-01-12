private static org.apache.cxf.configuration.jsse.TLSClientParameters getTLSClientParameters() throws java.lang.Exception {
    org.apache.cxf.configuration.jsse.TLSClientParameters tlsClientParameters = new org.apache.cxf.configuration.jsse.TLSClientParameters();
    tlsClientParameters.setDisableCNCheck(true);
    tlsClientParameters.setTrustManagers(io.subutai.core.hubadapter.impl.HttpClient.getTrustManagers());
    javax.net.ssl.KeyManagerFactory keyManagerFactory = javax.net.ssl.KeyManagerFactory.getInstance(javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm());
    keyManagerFactory.init(io.subutai.core.hubadapter.impl.HttpClient.getPeerKeyStore(), SecuritySettings.KEYSTORE_PX1_PSW.toCharArray());
    tlsClientParameters.setKeyManagers(keyManagerFactory.getKeyManagers());
    return tlsClientParameters;
}