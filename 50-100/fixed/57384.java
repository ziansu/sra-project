@java.lang.Override
public void removeEventListener(java.lang.Object type, org.ogcs.event.EventListener listener) {
    java.lang.Object listeners = map.get(type);
    if (listeners == null) {
        return ;
    }
    if (listeners instanceof org.ogcs.event.EventListenerSet) {
        org.ogcs.event.EventListenerSet set = ((org.ogcs.event.EventListenerSet) (listeners));
        set.remove(listener);
        if (set.isEmpty()) {
            map.remove(type);
        }
    }else
        if (listeners.equals(listener)) {
            map.remove(type);
        }
    
}