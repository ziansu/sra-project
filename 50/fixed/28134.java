public void turnLeft() {
    angle = (((angle) - (this.tankRotation)) + 360) % 360;
    turret.turnWithTank("LEFT", tankRotation);
}