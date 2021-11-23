@java.lang.Override
public void add(final org.exist.collections.Collection c, final int initialRefCount) {
    final org.exist.collections.Collection collection;
    if (c instanceof org.exist.collections.LockedCollection) {
        collection = ((org.exist.collections.LockedCollection) (c)).getCollection();
    }else {
        collection = c;
    }
    super.add(collection, initialRefCount);
    final java.lang.String name = collection.getURI().getRawCollectionPath();
    names.put(name, collection.getKey());
}