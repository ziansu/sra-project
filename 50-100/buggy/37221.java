@org.junit.Test
public void shouldNotAddPushEventByDefaultForProjectWithoutTrigger() throws java.io.IOException {
    hudson.model.FreeStyleProject project = jenkins.createFreeStyleProject();
    project.setScm(org.jenkinsci.plugins.github.webhook.WebhookManagerTest.GIT_SCM);
    manager.registerFor(project).run();
    org.mockito.Mockito.verify(manager, org.mockito.Mockito.never()).createHookSubscribedTo(org.mockito.Matchers.anyListOf(org.kohsuke.github.GHEvent.class));
}