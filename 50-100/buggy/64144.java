public int acceleration() {
    double F = (((this.mass) * (this.standardAcceleration)) - (dragForce())) - (((wheelFrictionForce) * (speed)) / 120);
    return ((int) (F / (this.mass)));
}