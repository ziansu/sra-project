@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testSaveIllegalMethod() {
    final java.util.Map<java.lang.String, java.lang.String> resourceParams = new java.util.HashMap<>();
    resourceParams.put(com.monits.volleyrequests.restsupport.RestResourceTest.RESOURCE_PARAM_USER_ID, com.monits.volleyrequests.restsupport.RestResourceTest.RESOURCE_VALUE_USER_ID);
    restResource.saveObject(Request.Method.DELETE, resourceParams, new com.monits.volleyrequests.restsupport.RestResourceTest.DummyListener<>(), null, new java.lang.Object());
}