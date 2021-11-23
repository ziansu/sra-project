@java.lang.Override
public void addCollection(final java.util.Collection collection) {
    if (!(collectionIds.get(collection.getId()))) {
        collectionIds.set(collection.getId());
        collections.add(collection);
    }
}