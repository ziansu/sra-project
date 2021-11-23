public boolean overlap(asteroids.model.Entity otherEntity) {
    double distance = this.getDistanceBetween(otherEntity);
    return distance <= 0;
}