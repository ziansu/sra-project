@java.lang.Override
public com.amalto.core.storage.Storage get(java.lang.String storageName, com.amalto.core.storage.StorageType type) {
    if ((StorageAdmin.SYSTEM_STORAGE.equals(storageName)) && ((com.amalto.core.storage.StorageType.SYSTEM) == type)) {
        return null;
    }else {
        for (com.amalto.core.storage.Storage s : storages) {
            if ((s.getName().equals(storageName)) && ((s.getType()) == type)) {
                return s;
            }
        }
        return super.get(storageName, type);
    }
}