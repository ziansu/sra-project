public void setGravity(com.jme3.math.Vector3f gravity) {
    gravity.set(gravity);
    setGravity(physicsSpaceId, gravity);
}