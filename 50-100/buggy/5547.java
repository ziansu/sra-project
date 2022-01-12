public void addToPool(SimpleGameObject obj) {
    if ((obj.faction) == 1) {
        this.friendlyPool.add(obj);
    }
    if ((obj.faction) == 0) {
        this.friendlyObjectPool.add(obj);
    }
    if ((obj.faction) == (-1)) {
        this.hostilePool.add(obj);
    }
    if ((obj.faction) == (-2)) {
        ObjectPool.hostileObjectPool.add(obj);
    }
}