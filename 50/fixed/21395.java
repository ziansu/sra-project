public void setSpeed(double speed) {
    speed /= java.lang.Math.max(1, java.lang.Math.abs(speed));
    planetaryTalon.set((-speed));
    wormTalon.set(speed);
}