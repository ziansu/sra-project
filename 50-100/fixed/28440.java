private static synchronized void addLogger(org.apache.cassandra.db.OpLogger logger) {
    if ((org.apache.cassandra.db.OpLogger.flusher) == null) {
        assert (org.apache.cassandra.db.OpLogger.loggers) != null;
        org.apache.cassandra.db.OpLogger.flusher = new java.lang.Thread(() -> {
            try {
                java.lang.Thread.sleep(((org.apache.cassandra.db.OpLogger.WRITE_PERIOD_SECONDS) * 1000));
            } catch (java.lang.InterruptedException $) {
            }
            for (org.apache.cassandra.db.OpLogger l : org.apache.cassandra.db.OpLogger.loggers) {
                l.flush();
            }
        });
    }
    org.apache.cassandra.db.OpLogger.loggers.add(logger);
}