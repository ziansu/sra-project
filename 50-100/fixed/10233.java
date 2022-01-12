public com.jme3.math.Vector3f warp(com.jme3.math.Vector3f newPos) {
    com.jme3.math.Vector3f newPos2d = new com.jme3.math.Vector3f(newPos.x, position.y, newPos.z);
    currentCell = navMesh.findClosestCell(newPos2d);
    currentPos3d.set(navMesh.snapPointToCell(currentCell, newPos2d));
    currentPos3d.setY(newPos.getY());
    currentPos.set(currentPos3d.getX(), currentPos3d.getZ());
    return currentPos3d;
}