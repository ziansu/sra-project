@java.lang.Override
public boolean collide(com.jme3.bullet.collision.PhysicsCollisionObject pco, com.jme3.bullet.collision.PhysicsCollisionObject pco1) {
    if (((pco.getCollideWithGroups()) > 1) || ((pco1.getCollisionGroup()) > 1)) {
        if (((pco.getCollideWithGroups()) == (pco1.getCollisionGroup())) || ((pco1.getCollideWithGroups()) == (pco.getCollisionGroup()))) {
            return true;
        }
    }
    return false;
}