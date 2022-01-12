@java.lang.Override
public com.amalto.core.storage.Storage get(java.lang.String storageName, com.amalto.core.storage.StorageType type) {
    for (com.amalto.core.storage.Storage s : storages) {
        if ((s.getName().equals(storageName)) && ((s.getType()) == type)) {
            return s;
        }
    }
    return super.get(storageName, type);
}