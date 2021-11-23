private void refillCollisionQueue() {
    synchronized(collisionQueue) {
        collisionQueue.clear();
    }
    synchronized(circlesOnField) {
        for (bouncingballs.GameCircle circle : circlesOnField) {
            predict(circle);
        }
    }
}