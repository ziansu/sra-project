private void incrementWaitTime(float deltaTime) {
    waitTime -= deltaTime * (java.lang.Math.max(type.getMaxWorkers(), workers.size()));
}