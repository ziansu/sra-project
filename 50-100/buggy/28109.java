public void evolve(double time) {
    if (time <= 0) {
        return ;
    }
    double timeToFirstCollision = this.getTimeToFirstCollision();
    if (time >= timeToFirstCollision) {
        this.advance(time);
        return ;
    }else
        this.advance(timeToFirstCollision);
    
    this.resolveCollision();
    this.evolve((time - timeToFirstCollision));
}