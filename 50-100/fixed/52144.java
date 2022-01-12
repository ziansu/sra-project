public com.jme3.math.Vector3f warpInside(com.jme3.math.Vector3f position) {
    com.jme3.math.Vector3f newPos2d = new com.jme3.math.Vector3f(position.x, position.y, position.z);
    com.jme3.ai.navmesh.Cell cell = navMesh.findClosestCell(newPos2d);
    position.set(navMesh.snapPointToCell(cell, newPos2d));
    return position;
}