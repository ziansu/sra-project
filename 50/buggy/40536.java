@java.lang.Override
public javax.net.ssl.SSLEngine clientSslEngineFor(javax.net.ssl.SSLSession serverSslSession) {
    return selfSignedSslEngineSource.newSslEngine(serverSslSession);
}