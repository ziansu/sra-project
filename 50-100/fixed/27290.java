@java.lang.Override
public boolean isColliding(com.zerokstudios.socratesman.gameobject.Entity entity, int time) {
    if (entity != null) {
        com.zerokstudios.socratesman.Vector difference = nextPosition(time).difference(entity.nextPosition(time)).abs();
        int collisionRadius = (map.getTileDiameter()) - 4;
        return ((difference.X) < collisionRadius) && ((difference.Y) < collisionRadius);
    }
    return false;
}