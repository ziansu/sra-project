protected void openIfClosed() {
    if (closed.get()) {
        try {
            reOpen();
            scheduleCommitTask();
        } catch (java.io.IOException e) {
            com.orientechnologies.common.log.OLogManager.instance().error(this, ("error while opening closed index:: " + (indexName())), e);
        }
    }
}