@java.lang.Override
public com.jme3.scene.Mesh jmeClone() {
    try {
        com.jme3.scene.Mesh clone = ((com.jme3.scene.Mesh) (super.clone()));
        return clone;
    } catch (java.lang.CloneNotSupportedException ex) {
        throw new java.lang.AssertionError();
    }
}