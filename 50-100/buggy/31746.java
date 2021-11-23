public void update(float deltaTime) {
    while (deltaTime > 0) {
        float minTime = java.lang.Math.min(deltaTime, nextCollisionTime);
        for (Model.GameObjects.Ball ball : balls) {
            ball.move(minTime);
        }
        deltaTime -= minTime;
        nextCollisionTime -= minTime;
        if (deltaTime > 0) {
            handleCollisions();
            nextCollisionTime = collision.estimateNextCollision(this);
        }
    } 
}