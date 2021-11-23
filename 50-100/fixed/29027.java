@java.lang.Override
public void onEvent(org.ehcache.event.CacheEvent<java.lang.Object, java.lang.Object> event) {
    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger((((org.ehcache.Ehcache.class) + "-") + "GettingStarted"));
    logger.info(event.getType().toString());
    if ((event.getType()) == (org.ehcache.event.EventType.EVICTED)) {
        (org.ehcache.GettingStarted.ListenerObject.evicted)++;
    }
}