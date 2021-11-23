@org.junit.Test
public void testLambdaRequestAllowNullArgumentList() throws java.lang.Exception {
    io.skygear.skygear.LambdaRequest request = new io.skygear.skygear.LambdaRequest("test:op1", null);
    junit.framework.Assert.assertEquals("test:op1", request.action);
    junit.framework.Assert.assertNull(request.data.get("args"));
    junit.framework.Assert.assertFalse(request.data.keySet().contains("args"));
    request.validate();
}