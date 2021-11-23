@java.lang.Deprecated
public void spawn(final com.jme3.scene.Node node, final com.jme3.bullet.PhysicsSpace space, final com.jme3.math.Vector3f location, final com.jme3.math.Vector3f speed) {
    spawn(node, space, false);
    setLocation(location);
    setSpeed(speed);
}