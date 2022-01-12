@java.lang.Override
public long check(com.parallels.desktopcloud.ParallelsDesktopVMSlaveComputer c) {
    com.parallels.desktopcloud.ParallelsDesktopCloudRetentionStrategy.LOGGER.log(java.util.logging.Level.SEVERE, "Check VM computer %s", c.getName());
    if (c.isIdle()) {
        try {
            com.parallels.desktopcloud.ParallelsDesktopCloudRetentionStrategy.LOGGER.log(java.util.logging.Level.SEVERE, "Disconnecting computer...");
            c.disconnect(null).get();
            c.getNode().terminate();
        } catch (java.lang.Exception e) {
            com.parallels.desktopcloud.ParallelsDesktopCloudRetentionStrategy.LOGGER.log(java.util.logging.Level.SEVERE, "Error: %s", e);
        }
    }
    return 1;
}