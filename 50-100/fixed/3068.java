@cucumber.api.java.After(order = 10)
public void zkConnectionTeardown() throws java.lang.Exception {
    if (!("".equals(java.lang.System.getProperty("ZOOKEEPER_HOSTS", "")))) {
        commonspec.getLogger().debug("Closing zookeeper connection");
        if (commonspec.getZookeeperSecClient().isConnected()) {
            commonspec.getZookeeperSecClient().disconnect();
        }
    }
}