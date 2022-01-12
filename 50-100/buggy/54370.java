@java.lang.Override
public synchronized void onResourceUpdate(java.lang.String name, co.cask.cdap.security.auth.KeyIdentifier instance) {
    co.cask.cdap.security.auth.DistributedKeyManager.LOG.debug("SharedResourceCache triggered update: leader={}, resource key={}", leader, name);
    if (((currentKey) == null) || ((instance.getExpiration()) > (currentKey.getExpiration()))) {
        currentKey = instance;
        co.cask.cdap.security.auth.DistributedKeyManager.LOG.info("Set current key: leader={}, key={}", leader, currentKey.getKeyId());
    }
}