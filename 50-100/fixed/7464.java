public void secondOrderPositionUpdate(double dt, Vector3D force) {
    position = new Vector3D(Vector3D.vectorAddition(position, velocity.scalarMultiply(dt)));
    position = new Vector3D(Vector3D.vectorAddition(position, force.scalarMultiply(((java.lang.Math.pow(dt, 2)) / (2 * (mass))))));
}