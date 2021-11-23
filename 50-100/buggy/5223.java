private boolean securityEntryCheck(net.tomp2p.peers.Number480 key, java.security.PublicKey publicKeyMessage, java.security.PublicKey publicKeyData, boolean entryProtection) {
    boolean entryProtectedByOthers = backend.isEntryProtectedByOthers(key, publicKeyMessage);
    if (!entryProtection) {
        return !entryProtectedByOthers;
    }else {
        if (canClaimEntry(key, publicKeyMessage)) {
            if (canProtectEntry(key.domainKey(), publicKeyMessage)) {
                return backend.protectEntry(key, publicKeyData);
            }else {
                return true;
            }
        }
    }
    return false;
}