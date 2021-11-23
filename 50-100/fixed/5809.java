@java.lang.Override
public void run() {
    this.running = true;
    while (this.running) {
        try {
            java.lang.Thread.sleep(this.sessionCacheInterval);
            this.logger.debug(com.qut.middleware.spep.sessions.Messages.getString("SessionCacheImpl.10"));
            cleanup();
        } catch (java.lang.Exception e) {
            this.logger.error(java.text.MessageFormat.format(com.qut.middleware.spep.sessions.Messages.getString("SessionCacheImpl.11"), e.toString()), e);
        }
    } 
}