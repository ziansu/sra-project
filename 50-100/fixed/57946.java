@java.lang.Override
public void rollback(java.lang.Iterable<org.polymap.model2.Entity> modified) {
    super.rollback(modified);
    for (org.polymap.model2.Entity entity : modified) {
        java.lang.Integer storeVersion = storeVersions.get(entity.id());
        if (storeVersion != null) {
            loadedVersions.put(entity.id(), storeVersion);
        }else {
            loadedVersions.remove(entity.id());
        }
    }
    prepared = null;
}