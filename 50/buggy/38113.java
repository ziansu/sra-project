public void applyProperties(com.jme3.scene.Geometry g) {
    this.geo = g;
    g.getControl(com.jme3.bullet.control.RigidBodyControl.class).setFriction(friction);
}