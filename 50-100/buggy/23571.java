@org.junit.Test
public void skip_missingRepositoryUrl() throws java.io.IOException {
    hudson.model.FreeStyleProject testProject = com.dabsquared.gitlabjenkins.webhook.build.PushBuildActionTest.jenkins.createFreeStyleProject();
    testProject.addTrigger(trigger);
    new com.dabsquared.gitlabjenkins.webhook.build.PushBuildAction(testProject, getJson("PushEvent_missingRepositoryUrl.json"), null).execute(response);
    org.mockito.Mockito.verify(trigger, org.mockito.Mockito.never()).onPost(org.mockito.Matchers.any(com.dabsquared.gitlabjenkins.gitlab.hook.model.PushHook.class));
}