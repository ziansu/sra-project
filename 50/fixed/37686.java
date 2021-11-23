@java.lang.Override
protected java.util.Collection<TListClient> getClientObjects(de.fau.cs.mad.kwikshop.android.model.synchronization.ListSyncData<TListClient, TListServer> syncData) {
    return syncData.getClientLists().values();
}