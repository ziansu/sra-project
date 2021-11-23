private org.terasology.math.Region3i createAABB(org.terasology.math.geom.Vector3i mainLocation, java.util.Collection<org.terasology.math.geom.Vector3i> memberLocations) {
    org.terasology.math.Region3i aabb = org.terasology.math.Region3i.createFromMinAndSize(mainLocation, new org.terasology.math.geom.Vector3i(1, 1, 1));
    for (org.terasology.math.geom.Vector3i memberLocation : memberLocations) {
        aabb = aabb.expandToContain(memberLocation);
    }
    return aabb;
}