protected static <R extends io.realm.BaseRealm> void addRealmToWaitList(R realm) {
    if (realm == null) {
        return ;
    }
    io.realm.BaseRealm.waitingRealms.put(realm.getPath(), new java.lang.ref.WeakReference<R>(realm));
}