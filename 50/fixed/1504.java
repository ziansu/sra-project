public void velocityUpdate(double dt, Vector3D force) {
    velocity = new Vector3D(Vector3D.vectorAddition(velocity, force.scalarMultiply((dt / (mass)))));
}