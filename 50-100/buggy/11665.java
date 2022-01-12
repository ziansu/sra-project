public void evolve(double time, asteroids.part2.CollisionListener collistionListener) {
    if (time <= 0) {
        return ;
    }
    double timeToFirstCollision = this.getTimeToFirstCollision();
    if (time <= timeToFirstCollision) {
        this.advance(time);
        return ;
    }
    this.advance(timeToFirstCollision);
    this.resolveCollision(collistionListener);
    java.lang.System.out.println(timeToFirstCollision);
    this.evolve((time - timeToFirstCollision), collistionListener);
}