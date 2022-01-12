@java.lang.Override
public void removeAttributes() {
    java.util.Set<java.lang.String> names = getAttributeNames();
    for (java.lang.String key : names) {
        ownerMessage.addEvent(Type.CLIENT_DELETE_DATA, key, null);
        syncEvents.add(new org.red5.server.so.SharedObjectEvent(org.red5.server.so.ISharedObjectEvent.Type.CLIENT_DELETE_DATA, key, null));
    }
    deleteStats.addAndGet(names.size());
    super.removeAttributes();
    modified = true;
    notifyModified();
}