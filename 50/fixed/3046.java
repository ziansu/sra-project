@java.lang.Override
public void post(final java.lang.Object event) {
    synchronized(me.sniggle.android.utils.otto.ActivatorBus.LOCK) {
        post(event, active);
    }
}