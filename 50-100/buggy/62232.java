@org.junit.Test
public void testQueryParamWithPrimitiveValueWithLong() throws java.lang.NoSuchMethodException {
    ch.rabbithole.sra.resource.ParameterMap map = new ch.rabbithole.sra.resource.ParameterMap();
    ch.rabbithole.sra.resource.ResourceExecution resource = createResourceExecution(getMethod("getWithParamWithLong", long.class), map);
    java.util.Map<java.lang.String, java.lang.String> queryParamMap = new java.util.HashMap<>();
    queryParamMap.put("param1", "100");
    org.mockito.Mockito.when(requestMock.getParameterMap()).thenReturn(queryParamMap);
    resource.execute(requestMock, responseMock);
    assertBufferContent("\"100\"");
}