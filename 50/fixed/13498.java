@java.lang.Override
public boolean isAcceptable(java.lang.String protocol, java.lang.String tlsProtocol, java.lang.String tlsCipher) {
    return (!(org.eclipse.jetty.http2.HTTP2Cipher.isBlackListProtocol(tlsProtocol))) || (!(org.eclipse.jetty.http2.HTTP2Cipher.isBlackListCipher(tlsCipher)));
}