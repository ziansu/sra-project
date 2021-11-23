public void removeEventListener(org.eclipse.tcf.te.runtime.interfaces.events.IEventListener listener) {
    org.eclipse.tcf.te.runtime.events.EventManager.ListenerListEntry listEntry = new org.eclipse.tcf.te.runtime.events.EventManager.ListenerListEntry(listener);
    listeners.remove(listEntry);
}