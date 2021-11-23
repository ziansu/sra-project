protected static <R extends io.realm.BaseRealm> void addRealmToWaitList(R realm) {
    io.realm.BaseRealm.waitingRealms.put(realm.getPath(), new java.lang.ref.WeakReference<R>(realm));
}