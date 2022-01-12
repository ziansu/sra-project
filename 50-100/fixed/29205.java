@org.junit.Test
public void testGetResponse() {
    com.sangupta.jerry.http.mock.TestDefaultHttpServiceImpl.handler.setResponse(RESPONSE_CODE, RANDOM_STRING);
    com.sangupta.jerry.http.WebResponse result = service.getResponse(com.sangupta.jerry.http.mock.TestDefaultHttpServiceImpl.LOCAL_URL);
    org.junit.Assert.assertEquals(RESPONSE_CODE, result.getResponseCode());
    org.junit.Assert.assertNotNull(result);
    org.junit.Assert.assertNotNull(result.getContent());
    org.junit.Assert.assertEquals(RANDOM_STRING, result.getContent());
}