private double getTimeToFirstCollision() {
    double timeToFirstCollision = java.lang.Double.MAX_VALUE;
    for (asteroids.model.Entity entity : entities) {
        for (asteroids.model.Entity otherEntity : entities) {
            if (entity == otherEntity) {
                continue;
            }
            double timeToParticularCollision = entity.getTimeToCollision(otherEntity);
            if (timeToParticularCollision < timeToFirstCollision) {
                timeToFirstCollision = timeToParticularCollision;
            }
        }
    }
    return timeToFirstCollision;
}