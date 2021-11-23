public double acceleration() {
    double F = (((this.mass) * (this.standardAcceleration)) - (dragForce())) - ((wheelFrictionForce) * ((speed) > 0 ? 1 : 0));
    return F / (this.mass);
}