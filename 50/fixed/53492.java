public synchronized void setIsKilled(boolean isKilled) {
    this.isKilled.set(isKilled);
    this.respawnTime = java.time.Instant.now().plusSeconds(5);
}