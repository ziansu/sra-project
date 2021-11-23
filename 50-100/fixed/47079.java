protected void initializeThread(java.util.Map<java.lang.String, java.lang.Object> settings) {
    this.sleepTime = parseSleepTime(settings.get("sleepTime"));
    if ((sleepTime) < 0) {
        com.dexels.repository.git.impl.GitRepositoryInstanceImpl.logger.info("No sleepTime specified, using default.");
        sleepTime = com.dexels.repository.git.impl.GitRepositoryInstanceImpl.DEFAULT_SLEEP_TIME;
    }
    updateThread = new java.lang.Thread(this);
    this.running = true;
    updateThread.start();
    com.dexels.repository.git.impl.GitRepositoryInstanceImpl.logger.info("Auto pull sync started!");
}