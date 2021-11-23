private void setupGit(java.lang.String url) throws java.io.IOException {
    hudson.plugins.git.UserRemoteConfig config = new hudson.plugins.git.UserRemoteConfig(url, null, null, null);
    java.util.List<hudson.plugins.git.UserRemoteConfig> configs = new java.util.ArrayList<hudson.plugins.git.UserRemoteConfig>();
    configs.add(config);
    hudson.plugins.git.GitSCM git = new hudson.plugins.git.GitSCM(configs, null, false, null, null, null, null);
    project.setScm(git);
}