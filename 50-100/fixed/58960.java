public void update(float _dt) {
    this.dt = _dt;
    updateObjects();
    collisionTree = new components.QuadTree(treeMaxCapacity, treeMaxDepth, new components.AABB(0, 0, mapSizeX, mapSizeY));
    for (gameObjects.GameObject go : core.getObjectManager().getAllObjects()) {
        collisionTree.insert(go);
    }
    collisionTree.checkCollision(this);
    moveObjects(dt);
}