@java.lang.Override
public void onOffline(hudson.model.Computer c) {
    hudson.model.TaskListener listener = new hudson.util.LogTaskListener(org.jenkinsci.plugins.slave_setup.ComputerListenerImpl.LOGGER, java.util.logging.Level.ALL);
    org.jenkinsci.plugins.slave_setup.ComputerListenerImpl.LOGGER.info((("right after slave " + (c.getName())) + " got offline ..."));
    org.jenkinsci.plugins.slave_setup.SetupConfig config = org.jenkinsci.plugins.slave_setup.SetupConfig.get();
    try {
        deployer.executeStateChangeScript(c, config, listener, false);
    } catch (hudson.AbortException e) {
        listener.getLogger().println("node-offline script have failed to execute");
    }
}