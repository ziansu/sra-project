private org.atlasapi.remotesite.pa.deletes.ExistingItemUnPublisher existingItemUnPublisher() {
    return org.atlasapi.remotesite.pa.deletes.ExistingItemUnPublisher.create(contentResolver, contentWriter, lookupEntryStore, new org.atlasapi.equiv.EquivalenceBreaker(contentResolver, lookupEntryStore, lookupWriter));
}