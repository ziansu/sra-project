public byte[] processToken(byte[] gssToken) throws org.ietf.jgss.GSSException {
    org.ietf.jgss.GSSContext context = gssManager.createContext(localKerberosCredentials);
    byte[] serverToken = context.acceptSecContext(gssToken, 0, gssToken.length);
    if (context.isEstablished()) {
        return serverToken;
    }
    return null;
}