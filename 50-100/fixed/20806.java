@java.lang.Override
public <I> org.spine3.server.storage.datastore.ProjectionStorage<I> createProjectionStorage(java.lang.Class<? extends org.spine3.server.entity.Entity<I, ?>> aClass) {
    final org.spine3.server.storage.datastore.DsEntityStorage<I> entityStorage = ((org.spine3.server.storage.datastore.DsEntityStorage<I>) (createEntityStorage(aClass)));
    final org.spine3.server.storage.datastore.DsPropertyStorage propertyStorage = org.spine3.server.storage.datastore.DsPropertyStorage.newInstance(datastore);
    return org.spine3.server.storage.datastore.DsProjectionStorage.newInstance(entityStorage, propertyStorage, aClass);
}