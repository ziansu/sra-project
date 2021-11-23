private void incrementWaitTime(float deltaTime) {
    waitTime -= deltaTime * (java.lang.Math.min(type.getMaxWorkers(), workers.size()));
}