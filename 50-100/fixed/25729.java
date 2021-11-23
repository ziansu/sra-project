private void closeStore(org.neo4j.kernel.impl.store.StoreType type) {
    int i = type.ordinal();
    if ((stores[i]) != null) {
        try {
            type.close(this, stores[i]);
        } finally {
            stores[i] = null;
        }
    }
}