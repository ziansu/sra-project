@org.junit.Test
public void failed() throws java.io.IOException, java.lang.InterruptedException {
    org.mockserver.model.HttpRequest[] requests = new org.mockserver.model.HttpRequest[]{ prepareExistsCommitWithSuccessResponse("test/project", "123abc") , prepareUpdateCommitStatusWithSuccessResponse("test/project", "123abc", ((jenkins.getInstance().getRootUrl()) + "/build/123"), BuildState.failed) };
    hudson.model.AbstractBuild build = mockBuild("123abc", "/build/123", com.dabsquared.gitlabjenkins.publisher.GitLabCommitStatusPublisherTest.GIT_LAB_CONNECTION, Result.FAILURE, "test/project");
    com.dabsquared.gitlabjenkins.publisher.GitLabCommitStatusPublisher publisher = new com.dabsquared.gitlabjenkins.publisher.GitLabCommitStatusPublisher();
    publisher.perform(build, null, listener);
    mockServerClient.verify(requests);
}