@org.junit.Test
public void testGetResponseHeaders() {
    com.sangupta.jerry.http.mock.TestDefaultHttpServiceImpl.handler.setResponse(RESPONSE_CODE, RANDOM_STRING);
    com.sangupta.jerry.http.mock.TestDefaultHttpServiceImpl.handler.setHeader(RANDOM_STRING, RANDOM_STRING);
    java.util.Map<java.lang.String, java.lang.String> result = service.getResponseHeaders(com.sangupta.jerry.http.mock.TestDefaultHttpServiceImpl.LOCAL_URL);
    org.junit.Assert.assertNotNull(result);
    org.junit.Assert.assertEquals(RANDOM_STRING, result.get(RANDOM_STRING));
}