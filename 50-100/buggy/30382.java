public double applyForce(double force, double maxSpeed) {
    double mass = getMass();
    double speedAdded = java.lang.Math.max(0, java.lang.Math.min((maxSpeed - (removedSpeed)), (force / mass)));
    addedSpeed += speedAdded;
    return speedAdded * mass;
}