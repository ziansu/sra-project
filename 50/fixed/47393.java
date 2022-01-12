@cucumber.api.java.After(order = 10)
public void remoteSSHConnectionTeardown() throws java.lang.Exception {
    if ((commonspec.getRemoteSSHConnection()) != null) {
        commonspec.getLogger().debug("Closing SSH remote connection");
        commonspec.getRemoteSSHConnection().getSession().disconnect();
    }
}