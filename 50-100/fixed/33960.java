@java.lang.Override
public void apply(org.gradle.api.Project project) {
    org.shipkit.gradle.configuration.ShipkitConfiguration conf = project.getPlugins().apply(org.shipkit.internal.gradle.configuration.ShipkitConfigurationPlugin.class).getConfiguration();
    java.lang.String writeToken = conf.getLenient().getGitHub().getWriteAuthToken();
    java.lang.String url = org.shipkit.internal.gradle.git.GitAuthPlugin.getGitHubUrl(conf.getGitHub().getRepository(), conf);
    gitAuth = new org.shipkit.internal.gradle.git.GitAuthPlugin.GitAuth(url, writeToken);
}