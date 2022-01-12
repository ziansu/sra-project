public void evolve(double time, asteroids.part2.CollisionListener collisionListener) {
    if (time <= 0) {
        return ;
    }
    double timeToFirstCollision = this.getTimeToFirstCollision();
    if (time < timeToFirstCollision) {
        this.advance(time);
        return ;
    }else {
        this.advance(timeToFirstCollision);
        java.lang.System.out.println(timeToFirstCollision);
        this.resolveCollision(collisionListener);
        this.evolve((time - timeToFirstCollision), collisionListener);
    }
}