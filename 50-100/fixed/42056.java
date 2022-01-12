public void addSpeed(int s) {
    if ((((shipSpeed) + s) <= (maxSpeed)) && (((shipSpeed) + s) >= ((-(maxSpeed)) / 2))) {
        shipSpeed += s;
        shipDirection = (s > 0) ? ShipDirection.FORWARD : ShipDirection.BACKWARD;
    }else {
        shipDirection = ((shipDirection) != (ShipDirection.NONE)) ? shipDirection : ShipDirection.NONE;
    }
}