@org.junit.Test
public void shouldNotSelectCredsWithCustomHost() {
    org.jenkinsci.plugins.github.config.GitHubServerConfig conf = new org.jenkinsci.plugins.github.config.GitHubServerConfig("");
    conf.setApiUrl(org.jenkinsci.plugins.github.webhook.WebhookManagerTest.ANOTHER_HOOK_ENDPOINT.toString());
    conf.setManageHooks(false);
    org.jenkinsci.plugins.github.GitHubPlugin.configuration().getConfigs().add(conf);
    org.junit.Assert.assertThat(org.jenkinsci.plugins.github.webhook.WebhookManager.forHookUrl(org.jenkinsci.plugins.github.webhook.WebhookManagerTest.HOOK_ENDPOINT).createHookSubscribedTo(com.google.common.collect.Lists.newArrayList(org.kohsuke.github.GHEvent.PUSH), null).apply(new com.cloudbees.jenkins.GitHubRepositoryName("github.com", "name", "repo")), org.hamcrest.Matchers.nullValue());
}