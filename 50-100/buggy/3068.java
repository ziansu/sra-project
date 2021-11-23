@cucumber.api.java.After(order = 10)
public void zkConnectionTeardown() throws java.lang.Exception {
    commonspec.getLogger().debug("Closing zookeeper connection");
    if (!("".equals(java.lang.System.getProperty("ZOOKEEPER_HOSTS", "")))) {
        if (commonspec.getZookeeperSecClient().isConnected()) {
            commonspec.getZookeeperSecClient().disconnect();
        }
    }
}