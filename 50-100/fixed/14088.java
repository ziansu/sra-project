public synchronized uk.ac.manchester.cs.mekon.store.disk.IFrame add(uk.ac.manchester.cs.mekon.store.disk.IFrame instance, uk.ac.manchester.cs.mekon.store.disk.CIdentity identity) {
    uk.ac.manchester.cs.mekon.store.disk.IFrame previous = checkRemove(identity);
    int index = indexes.assignIndex(identity);
    identities.add(identity);
    fileStore.write(instance, identity, index);
    checkAddToMatcher(instance, identity);
    return previous;
}