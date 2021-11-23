public void update(float _dt) {
    collisionTree.clean();
    collisionTree = new components.QuadTree(treeMaxCapacity, treeMaxDepth, new components.AABB(0, 0, mapSizeX, mapSizeY));
    for (gameObjects.GameObject go : core.getObjectManager().getAllObjects()) {
        collisionTree.insert(go);
    }
    this.dt = _dt;
    updateObjects();
    collisionTree.checkCollision(this);
    moveObjects(dt);
}