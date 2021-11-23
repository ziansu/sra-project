public com.google.cloud.datastore.KeyFactory getKeyFactory(org.spine3.server.storage.datastore.dsnative.Kind kind) {
    com.google.cloud.datastore.KeyFactory keyFactory = org.spine3.server.storage.datastore.DatastoreWrapper.keyFactories.get(kind);
    if (keyFactory == null) {
        keyFactory = initKeyFactory(kind);
    }
    final org.spine3.server.storage.datastore.dsnative.Namespace namespace = namespaceSupplier.getNamespace();
    keyFactory.setNamespace(namespace.getValue());
    return keyFactory;
}