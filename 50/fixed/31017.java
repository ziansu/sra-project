private void refillCollisionQueue() {
    synchronized(collisionQueue) {
        collisionQueue.clear();
    }
    synchronized(circlesOnField) {
        int index = 1;
        for (bouncingballs.GameCircle circle : circlesOnField) {
            predict(circle, index);
            ++index;
        }
    }
}