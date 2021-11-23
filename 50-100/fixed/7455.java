@org.junit.Test
public void assertUserScorePropertyIsAddedToUserThatDoesNotHaveIt() throws java.lang.Exception {
    hudson.model.AbstractBuild build = mock(hudson.model.AbstractBuild.class);
    hudson.model.User userWithoutProperty = createUser(null);
    mockChangeSetInBuild(build, userWithoutProperty);
    org.junit.Assert.assertThat(new hudson.plugins.cigame.GamePublisher().perform(build, createRuleBook(5.0), true, null, null, null), org.hamcrest.CoreMatchers.is(true));
    verify(userWithoutProperty).addProperty(new hudson.plugins.cigame.UserScoreProperty(5, true, anyList()));
}