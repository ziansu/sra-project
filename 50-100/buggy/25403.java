public synchronized void enableDebugging(boolean enable, com.trilead.ssh2.DebugLogger logger) {
    com.trilead.ssh2.log.Logger.enabled = enable;
    if (enable == false) {
        com.trilead.ssh2.log.Logger.logger = null;
    }else {
        if (logger == null) {
            logger = new com.trilead.ssh2.DebugLogger() {
                public void log(int level, java.lang.String className, java.lang.String message) {
                    long now = java.lang.System.currentTimeMillis();
                    java.lang.System.err.println(((((now + " : ") + className) + ": ") + message));
                }
            };
        }
    }
}