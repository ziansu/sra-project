@java.lang.Override
public org.terasology.asset.AssetUri getPrefabURI() {
    if (exists()) {
        org.terasology.entitySystem.entity.internal.EntityInfoComponent info = getComponent(org.terasology.entitySystem.entity.internal.EntityInfoComponent.class);
        if ((info != null) && (!(info.parentPrefab.exists()))) {
            return new org.terasology.asset.AssetUri(org.terasology.asset.AssetType.PREFAB, info.parentPrefab.getName());
        }
    }
    return null;
}