@org.junit.Test
public void postsNotificationsIoException() throws java.lang.Exception {
    int port = this.port();
    org.slf4j.Logger logger = org.mockito.Mockito.mock(org.slf4j.Logger.class);
    com.amihaiemil.charles.github.GithubNotificationsCheck ghnv = new com.amihaiemil.charles.github.GithubNotificationsCheck("", "", logger);
    org.mockito.Mockito.verify(logger).error(org.mockito.Mockito.anyString(), org.mockito.Mockito.any(java.io.IOException.class));
}