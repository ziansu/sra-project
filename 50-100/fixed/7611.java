public <T extends com.jaeksoft.searchlib.webservice.CommonResult> T checkCommonResult(javax.ws.rs.core.Response response, java.lang.Class<T> commonResultClass, int httpCode) {
    org.junit.Assert.assertNotNull(response);
    org.junit.Assert.assertEquals(response.getEntity().toString(), httpCode, response.getStatus());
    T commonResult = response.readEntity(commonResultClass);
    org.junit.Assert.assertNotNull(commonResult.successful);
    org.junit.Assert.assertEquals(true, commonResult.successful);
    return commonResult;
}