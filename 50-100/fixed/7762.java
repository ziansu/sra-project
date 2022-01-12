public entities.obstacles.Entity createEntity(java.lang.String eName, org.lwjgl.util.vector.Vector3f position, float rotX, float rotY, float rotZ, float scale) {
    long before = java.lang.System.currentTimeMillis();
    entities.obstacles.Entity e = new entities.obstacles.Entity(tModels.get(eName), 0, mData.get(eName), position, rotX, rotY, rotZ, scale, eName);
    world.add(e);
    return e;
}