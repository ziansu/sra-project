@java.lang.Override
public boolean authenticate(java.lang.String username, java.security.PublicKey publicKey, org.apache.sshd.server.session.ServerSession session) {
    return isAuthorizedKey(getPublicKeySignature(publicKey));
}