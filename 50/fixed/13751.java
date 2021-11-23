@org.junit.Test
public void doStartShouldStartANewSmppSession() throws java.lang.Exception {
    doStartExpectations();
    replay(endpoint, session);
    producer.doStart();
    verify(endpoint, session);
}