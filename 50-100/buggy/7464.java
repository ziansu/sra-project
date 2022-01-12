public void secondOrderPositionUpdate(double dt, Vector3D force) {
    position = Vector3D.vectorAddition(position, velocity.scalarMultiply(dt));
    position = Vector3D.vectorAddition(position, force.scalarMultiply(((java.lang.Math.pow(dt, 2)) / (2 * (mass)))));
}