private void setProxyCredentials(com.hp.application.automation.tools.run.Run<?, ?> run, java.io.PrintStream logger) {
    if (((proxySettings) != null) && ((proxySettings.getFsProxyCredentialsId()) != null)) {
        com.cloudbees.plugins.credentials.common.UsernamePasswordCredentials up = com.cloudbees.plugins.credentials.CredentialsProvider.findCredentialById(proxySettings.getFsProxyCredentialsId(), com.cloudbees.plugins.credentials.common.StandardUsernamePasswordCredentials.class, run, com.cloudbees.plugins.credentials.domains.URIRequirementBuilder.create().build());
        if (up != null) {
            proxySettings.setFsProxyUserName(up.getUsername());
            proxySettings.setFsProxyPassword(up.getPassword());
        }
    }
}