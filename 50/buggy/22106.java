public void activateBus() {
    synchronized(me.sniggle.android.utils.otto.ActivatorBus.LOCK) {
        for (java.lang.Object event : eventCache) {
            post(event);
        }
        eventCache.clear();
        active = true;
    }
}