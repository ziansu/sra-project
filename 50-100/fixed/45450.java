public void update(float deltaTime) {
    while (deltaTime > 0) {
        float minTime = java.lang.Math.min(deltaTime, nextCollisionTime);
        for (Model.GameObjects.Ball ball : balls) {
            ball.move(minTime);
        }
        deltaTime -= minTime;
        if (deltaTime > 0) {
            handleCollisions();
            nextCollisionTime = Model.GameObjects.Collision.estimateNextCollision(this);
            if ((nextCollisionTime) < 0.001F) {
                throw new java.lang.UnknownError("Estimating collision time is faulty.");
            }
        }
    } 
}