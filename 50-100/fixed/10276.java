@org.junit.Test
public void shouldReturnNullOnGettingEmptyEventsListToSubscribe() throws java.io.IOException {
    org.mockito.Mockito.doReturn(com.google.common.collect.Lists.newArrayList(repo)).when(active).resolve(org.mockito.Matchers.any(com.google.common.base.Predicate.class));
    org.mockito.Mockito.when(repo.hasAdminAccess()).thenReturn(true);
    org.junit.Assert.assertThat("empty events list not allowed to be registered", org.jenkinsci.plugins.github.webhook.WebhookManager.forHookUrl(org.jenkinsci.plugins.github.webhook.WebhookManagerTest.HOOK_ENDPOINT).createHookSubscribedTo(java.util.Collections.<org.kohsuke.github.GHEvent>emptyList(), null).apply(active), org.hamcrest.Matchers.nullValue());
}