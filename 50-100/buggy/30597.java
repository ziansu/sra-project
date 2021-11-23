@java.lang.Override
public synchronized void onUpdate() {
    co.cask.cdap.security.auth.DistributedKeyManager.LOG.debug("SharedResourceCache triggered update on key: leader={}", leader);
    for (co.cask.cdap.security.auth.KeyIdentifier keyEntry : keyCache.getResources()) {
        if (((currentKey) == null) || ((keyEntry.getExpiration()) > (currentKey.getExpiration()))) {
            currentKey = keyEntry;
            co.cask.cdap.security.auth.DistributedKeyManager.LOG.info("Set current key: leader={}, key={}", leader, currentKey.getKeyId());
        }
    }
}