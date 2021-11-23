@org.junit.Test
public void running() throws java.io.UnsupportedEncodingException {
    org.mockserver.model.HttpRequest[] requests = new org.mockserver.model.HttpRequest[]{ prepareExistsCommitWithSuccessResponse("test/project", "123abc") , prepareUpdateCommitStatusWithSuccessResponse("test/project", "123abc", ((jenkins.getInstance().getRootUrl()) + "/build/123"), BuildState.running) };
    hudson.model.AbstractBuild build = mockBuild("123abc", "/build/123", com.dabsquared.gitlabjenkins.publisher.GitLabCommitStatusPublisherTest.GIT_LAB_CONNECTION, null, "test/project");
    com.dabsquared.gitlabjenkins.publisher.GitLabCommitStatusPublisher publisher = new com.dabsquared.gitlabjenkins.publisher.GitLabCommitStatusPublisher();
    publisher.prebuild(build, listener);
    mockServerClient.verify(requests);
}