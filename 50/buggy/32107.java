public void remove(com.jme3.bullet.collision.PhysicsCollisionObject object) {
    this.bulletAppState.getPhysicsSpace().remove(object);
}