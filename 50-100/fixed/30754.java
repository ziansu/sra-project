@org.kohsuke.stapler.WebMethod(name = "")
@org.kohsuke.stapler.verb.GET
@io.jenkins.blueocean.commons.stapler.TreeResponse
public java.lang.Object getState() {
    java.lang.String apiUri = getUri();
    hudson.model.User user = getAuthenticatedUser();
    java.util.List<com.cloudbees.plugins.credentials.common.StandardUsernamePasswordCredentials> credentials = io.jenkins.blueocean.credential.CredentialsUtils.findCredentials(com.cloudbees.plugins.credentials.common.StandardUsernamePasswordCredentials.class, user, io.jenkins.blueocean.blueocean_github_pipeline.GithubEnterpriseScm.DOMAIN_NAME);
    for (com.cloudbees.plugins.credentials.common.StandardUsernamePasswordCredentials cred : credentials) {
        if (cred.getId().equals(getCredentialId())) {
            return this;
        }
    }
    throw new io.jenkins.blueocean.commons.ServiceException.NotFoundException(("Credential not found for apiUrl=" + apiUri));
}