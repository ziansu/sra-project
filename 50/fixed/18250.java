@java.lang.Override
public void disposeScene() {
    arkanoidPhysicsWorld.clearForces();
    arkanoidPhysicsWorld.destroyBody(wall_body);
    platform.detachSelf();
    platform.dispose();
    this.detachSelf();
}