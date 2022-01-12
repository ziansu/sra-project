@org.junit.Test
public void testGetDocContent_invalidDocId1() throws java.lang.Exception {
    adaptor.init(context);
    com.google.enterprise.adaptor.testing.RecordingResponse response = new com.google.enterprise.adaptor.testing.RecordingResponse();
    adaptor.getDocContent(new com.google.enterprise.adaptor.filenet.MockRequest(new com.google.enterprise.adaptor.DocId("foo")), response);
    org.junit.Assert.assertEquals(RecordingResponse.State.NOT_FOUND, response.getState());
}