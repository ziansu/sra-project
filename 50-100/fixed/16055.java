public org.relativity.entities.State thrustHorizontal(double delta, double accel) {
    if ((crashed) && (entity.crashable)) {
        return this;
    }
    double acc = accel;
    acc *= delta;
    acc *= lorentzFactor;
    org.relativity.util.Vector thrust = rotation.vector().normal().scale(acc);
    org.relativity.entities.State s = new org.relativity.entities.State(this, thrust);
    return s;
}