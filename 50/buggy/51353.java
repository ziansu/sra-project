public void removeEventListener(org.eclipse.tcf.te.runtime.interfaces.events.IEventListener listener) {
    org.eclipse.tcf.te.runtime.events.EventManager.ListenerListEntry listEntry = new org.eclipse.tcf.te.runtime.events.EventManager.ListenerListEntry(listener, ((java.lang.Class<?>) (null)), ((java.lang.Object) (null)));
    listeners.remove(listEntry);
}