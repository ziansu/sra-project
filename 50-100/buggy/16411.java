@org.junit.Test
public void shouldAddPushEventByDefault() throws java.io.IOException {
    hudson.model.FreeStyleProject project = jenkins.createFreeStyleProject();
    project.addTrigger(new com.cloudbees.jenkins.GitHubPushTrigger(null));
    project.setScm(org.jenkinsci.plugins.github.webhook.WebhookManagerTest.GIT_SCM);
    manager.registerFor(project).run();
    org.mockito.Mockito.verify(manager).createHookSubscribedTo(com.google.common.collect.Lists.newArrayList(org.kohsuke.github.GHEvent.PUSH));
}