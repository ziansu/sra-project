@java.lang.Override
public void enqueueEvent(org.opendaylight.ovsdb.openstack.netvirt.AbstractEvent event) {
    if (event == null) {
        org.opendaylight.ovsdb.openstack.netvirt.impl.EventDispatcherImpl.logger.warn("enqueueEvent: event is null");
        return ;
    }
    try {
        events.put(event);
        java.lang.System.out.println(("LA" + (events.size())));
    } catch (java.lang.InterruptedException e) {
        org.opendaylight.ovsdb.openstack.netvirt.impl.EventDispatcherImpl.logger.error("Thread was interrupted while trying to enqueue event ", e);
    }
}