@java.lang.Override
public boolean removeAttribute(java.lang.String name) {
    boolean result = true;
    ownerMessage.addEvent(Type.CLIENT_DELETE_DATA, name, null);
    if (super.removeAttribute(name)) {
        modified.set(true);
        syncEvents.add(new org.red5.server.so.SharedObjectEvent(org.red5.server.so.ISharedObjectEvent.Type.CLIENT_DELETE_DATA, name, null));
        deleteStats.incrementAndGet();
    }else {
        result = false;
    }
    notifyModified();
    return result;
}