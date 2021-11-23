@java.lang.Override
protected boolean hostKeyUnverifiableAction(java.lang.String hostname, java.security.PublicKey key) {
    try {
        return isUnknownKeyAccepted(hostname, key);
    } catch (ch.cyberduck.core.exception.ConnectionCanceledException e) {
        return false;
    } catch (ch.cyberduck.core.exception.ChecksumException e) {
        return false;
    }
}