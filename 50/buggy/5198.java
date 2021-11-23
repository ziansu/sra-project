public void positionUpdate(double dt) {
    position = Vector3D.vectorAddition(position, velocity.scalarMultiply(dt));
}