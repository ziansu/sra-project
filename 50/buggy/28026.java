private void assertIsRefResponse(io.swagger.util.Response response, java.lang.String expectedRef) {
    org.testng.Assert.assertTrue((response instanceof io.swagger.util.RefResponse));
    io.swagger.util.RefResponse refResponse = ((io.swagger.util.RefResponse) (response));
    org.testng.Assert.assertEquals(refResponse.get$ref(), expectedRef);
}