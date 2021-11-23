public void setCommitterInfo(final java.lang.String cheServerUrl, final java.lang.String gitHubToken, final java.lang.String keycloakToken) {
    io.fabric8.che.starter.model.github.GitHubUserInfo userInfo = client.getUserInfo(gitHubToken);
    io.fabric8.che.starter.model.WorkspacePreferences preferences = getPreferences(userInfo);
    setCommitterInfo(cheServerUrl, keycloakToken, preferences);
}