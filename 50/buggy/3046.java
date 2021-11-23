@java.lang.Override
public void post(final java.lang.Object event) {
    synchronized(me.sniggle.android.utils.otto.ActivatorBus.LOCK) {
        if (active) {
            postEvent(event);
        }else {
            eventCache.add(event);
        }
    }
}