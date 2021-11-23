@cucumber.api.java.After(order = 10)
public void remoteSSHConnectionTeardown() throws java.lang.Exception {
    commonspec.getLogger().debug("Closing SSH remote connection");
    if ((commonspec.getRemoteSSHConnection()) != null) {
        commonspec.getRemoteSSHConnection().getSession().disconnect();
    }
}