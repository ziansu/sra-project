public synchronized void setIsKilled(boolean isKilled) {
    this.isKilled = isKilled;
    this.respawnTime = java.time.Instant.now().plusSeconds(5);
}