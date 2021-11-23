@java.lang.Override
public void run() {
    try {
        updateRequestDB();
    } catch (java.lang.Throwable e) {
        org.fogbowcloud.manager.core.ManagerController.LOGGER.error("Could not update the database.", e);
    }
}