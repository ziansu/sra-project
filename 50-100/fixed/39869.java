@java.lang.Override
public void run() {
    org.graylog2.messagehandlers.common.MessageCounter counter = org.graylog2.messagehandlers.common.MessageCounter.getInstance();
    try {
        org.graylog2.database.MongoBridge m = new org.graylog2.database.MongoBridge();
        m.writeMessageCounts(counter.getTotalCount(), counter.getStreamCounts(), counter.getHostCounts());
    } catch (java.lang.Exception e) {
        org.graylog2.periodical.MessageCountWriterThread.LOG.warn(("Error in MessageCountWriterThread: " + (e.getMessage())), e);
    } finally {
        counter.resetAllCounts();
    }
}