@java.lang.Override
public void removeEventListener(java.lang.Object type, org.ogcs.event.EventListener listener) {
    java.lang.Object listeners = map.get(type);
    if (listeners == null) {
        return ;
    }
    if (listeners instanceof org.ogcs.event.EventListenerSet) {
        ((org.ogcs.event.EventListenerSet) (listeners)).remove(listener);
    }else
        if (listeners.equals(listener)) {
            map.remove(type);
        }
    
}