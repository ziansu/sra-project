@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void toParseResponse_NullTypesList_Test() {
    final com.spectralogic.ds3autogen.api.models.apispec.Ds3ResponseCode responseCode = new com.spectralogic.ds3autogen.api.models.apispec.Ds3ResponseCode(200, null);
    toParseResponse(responseCode, "TestResponse");
}