private boolean isInProtectedRegion(java.util.Collection<org.terasology.math.geom.Vector3i> positions) {
    for (org.terasology.entitySystem.entity.EntityRef regionEntity : entityManager.getEntitiesWith(org.terasology.structureTemplates.components.ProtectedRegionsComponent.class)) {
        if (org.terasology.structureTemplates.util.ProtectedRegionUtility.isInProtectedRegion(positions, regionEntity)) {
            return true;
        }
    }
    return false;
}