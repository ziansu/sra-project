@org.junit.Test
public void postsNotificationsServerError() throws java.lang.Exception {
    int port = this.port();
    com.jcabi.http.mock.MkContainer server = new com.jcabi.http.mock.MkGrizzlyContainer().next(new com.jcabi.http.mock.MkAnswer.Simple(500)).start(port);
    try {
        org.slf4j.Logger logger = org.mockito.Mockito.mock(org.slf4j.Logger.class);
        com.amihaiemil.charles.github.GithubNotificationsCheck ghnv = new com.amihaiemil.charles.github.GithubNotificationsCheck("", "", logger);
        org.mockito.Mockito.verify(logger).error(org.mockito.Mockito.anyString(), org.mockito.Mockito.any(java.lang.AssertionError.class));
    } finally {
        server.stop();
    }
}