private void tearDownEnvironment() {
    if ((configuration.getEnvironmentTeardownScriptUrl()) != null) {
        try {
            session.getLogger().info(("Executing environment teardown script from:" + (configuration.getEnvironmentTeardownScriptUrl())));
            org.arquillian.cube.kubernetes.impl.utils.ProcessUtil.runCommand(session.getLogger(), configuration.getEnvironmentTeardownScriptUrl());
        } catch (java.io.IOException ex) {
            session.getLogger().warn(("Failed to execute teardown script, due to: " + (ex.getMessage())));
        }
    }
}