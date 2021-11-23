@org.junit.Test(timeout = 5000)
public void testCreateTemporaryTopicFailsWhenLinkRefusedAndAttachResponseWriteIsNotDeferred() throws java.lang.Exception {
    doCreateTemporaryDestinationFailsWhenLinkRefusedTestImpl(false, false);
}