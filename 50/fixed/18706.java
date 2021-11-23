@java.lang.Override
public boolean hasColumn(java.lang.String id) {
    return store.hasColumn(id.toLowerCase());
}