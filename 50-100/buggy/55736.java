private org.apache.kerby.kerberos.kerb.spec.ap.Authenticator makeAuthenticator() {
    org.apache.kerby.kerberos.kerb.spec.ap.Authenticator authenticator = new org.apache.kerby.kerberos.kerb.spec.ap.Authenticator();
    authenticator.setCname(getClientPrincipal());
    authenticator.setCrealm(tgt.getRealm());
    authenticator.setCtime(org.apache.kerby.kerberos.kerb.spec.KerberosTime.now());
    authenticator.setCusec(0);
    org.apache.kerby.kerberos.kerb.spec.base.EncryptionKey sessionKey = tgt.getSessionKey();
    authenticator.setSubKey(sessionKey);
    return authenticator;
}