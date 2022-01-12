public void addChangeListener(io.realm.RealmChangeListener<io.realm.RealmResults<E>> listener) {
    if (listener == null) {
        throw new java.lang.IllegalArgumentException("Listener should not be null");
    }
    realm.checkIfValid();
    if (isTableRemoved()) {
        throw new java.lang.IllegalStateException("You can't register a listener to where no data is available.");
    }
    if ((realm.handler) == null) {
        throw new java.lang.IllegalStateException("You can't register a listener from a non-Looper thread ");
    }
    if (!(listeners.contains(listener))) {
        listeners.add(listener);
    }
}