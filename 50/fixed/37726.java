@java.lang.Override
protected boolean hostKeyUnverifiableAction(final java.lang.String hostname, final java.security.PublicKey key) {
    try {
        return isUnknownKeyAccepted(hostname, key);
    } catch (ch.cyberduck.core.exception.ConnectionCanceledException | ch.cyberduck.core.exception.ChecksumException e) {
        return false;
    }
}