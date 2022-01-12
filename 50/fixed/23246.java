@java.lang.Override
public boolean apply(org.apache.ignite.events.CacheEvent evt) {
    latch.countDown();
    return true;
}