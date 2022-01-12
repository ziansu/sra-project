@org.junit.Test
public void testGetDocContent_invalidDocId1() throws java.lang.Exception {
    adaptor.init(context);
    java.util.List<java.lang.String> messages = new java.util.ArrayList<java.lang.String>();
    com.google.enterprise.adaptor.filenet.Logging.captureLogMessages(com.google.enterprise.adaptor.filenet.FileNetAdaptor.class, "Invalid DocId:", messages);
    com.google.enterprise.adaptor.testing.RecordingResponse response = new com.google.enterprise.adaptor.testing.RecordingResponse();
    adaptor.getDocContent(new com.google.enterprise.adaptor.filenet.MockRequest(new com.google.enterprise.adaptor.DocId("foo")), response);
    org.junit.Assert.assertEquals(RecordingResponse.State.NOT_FOUND, response.getState());
    org.junit.Assert.assertEquals(messages.toString(), 1, messages.size());
}