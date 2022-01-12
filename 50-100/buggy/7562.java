public void read(com.jme3.math.JmeImporter e) throws java.io.IOException {
    com.jme3.math.InputCapsule capsule = e.getCapsule(this);
    rot = ((com.jme3.math.Quaternion) (capsule.readSavable("rot", new com.jme3.math.Quaternion())));
    translation = ((com.jme3.math.Vector3f) (capsule.readSavable("translation", Vector3f.ZERO)));
    scale = ((com.jme3.math.Vector3f) (capsule.readSavable("scale", Vector3f.UNIT_XYZ)));
}