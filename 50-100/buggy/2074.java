@org.junit.Test
public void assertPointsAreToExistingUserScoreProperty() throws java.lang.Exception {
    hudson.model.AbstractBuild build = mock(hudson.model.AbstractBuild.class);
    hudson.plugins.cigame.UserScoreProperty userScoreProperty = new hudson.plugins.cigame.UserScoreProperty(10, true, null);
    mockChangeSetInBuild(build, createUser(userScoreProperty));
    org.junit.Assert.assertThat(new hudson.plugins.cigame.GamePublisher().perform(build, createRuleBook(5.0), true, null, null), org.hamcrest.CoreMatchers.is(true));
    org.junit.Assert.assertThat(userScoreProperty.getScore(), org.hamcrest.CoreMatchers.is(15.0));
}