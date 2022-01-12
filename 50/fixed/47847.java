@java.lang.Override
public org.spine3.server.storage.datastore.dsnative.Namespace get() {
    return org.spine3.server.storage.datastore.dsnative.SingleTenantNamespaceSupplier.NamespaceSingleton.INSTANCE.value;
}