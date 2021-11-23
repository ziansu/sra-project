@java.lang.Override
public boolean treeCallback(int proxyId) {
    int other = proxyMap.get(proxyId);
    if (((current) != other) && (checkCollision(current, other))) {
        collisionDataMapper.get(other).callback.collideWith(current);
        collisionDataMapper.get(current).callback.collideWith(other);
    }else {
        return true;
    }
    return false;
}