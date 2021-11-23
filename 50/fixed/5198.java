public void positionUpdate(double dt) {
    position = new Vector3D(Vector3D.vectorAddition(position, velocity.scalarMultiply(dt)));
}