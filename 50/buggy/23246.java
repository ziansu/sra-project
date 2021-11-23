@java.lang.Override
public boolean apply(org.apache.ignite.events.CacheEvent evt) {
    latch.countDown();
    log.debug(java.lang.String.valueOf(latch.getCount()));
    return true;
}