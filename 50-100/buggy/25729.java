private void closeStore(org.neo4j.kernel.impl.store.StoreType type) {
    int i = type.ordinal();
    if ((stores[i]) != null) {
        type.close(this, stores[i]);
        stores[i] = null;
    }
}