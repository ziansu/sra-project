@asteroids.model.Basic
public double getRadius() {
    return (radius) - ((totalTraveledDistance) * 1.0E-6);
}