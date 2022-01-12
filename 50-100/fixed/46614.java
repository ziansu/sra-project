@java.lang.Override
public void install(dae.prefabs.Prefab parent) {
    this.parent = parent;
    characterControl = new com.jme3.bullet.control.BetterCharacterControl(radius, height, mass);
    parent.addControl(characterControl);
    if ((com.jme3.bullet.PhysicsSpace.getPhysicsSpace()) != null) {
        com.jme3.bullet.PhysicsSpace.getPhysicsSpace().add(characterControl);
    }
}