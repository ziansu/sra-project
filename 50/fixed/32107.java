public void remove(com.jme3.bullet.collision.PhysicsCollisionObject object) {
    if (object != null) {
        this.bulletAppState.getPhysicsSpace().remove(object);
    }
}