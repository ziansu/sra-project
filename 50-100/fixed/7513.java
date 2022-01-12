private void setupEnvironment() {
    org.arquillian.cube.kubernetes.api.Logger log = session.getLogger();
    log.info(("Executing environment setup script from:" + (configuration.getEnvironmentSetupScriptUrl())));
    try {
        org.arquillian.cube.kubernetes.impl.utils.ProcessUtil.runCommand(log, configuration.getEnvironmentSetupScriptUrl());
    } catch (java.io.IOException ex) {
        throw new java.lang.RuntimeException(ex);
    }
}