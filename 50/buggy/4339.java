@java.lang.Override
public boolean authenticate(java.lang.String username, java.security.PublicKey publicKey, org.apache.sshd.server.session.ServerSession session) {
    if (!(isAuthorizedKey(getPublicKeySignature(publicKey)))) {
        return false;
    }
    return true;
}