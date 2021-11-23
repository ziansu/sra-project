@org.testng.annotations.Test(groups = { "integration" , "services" , "httpget" , "virtual" }, description = "A negative integration test to verify the response code from a get call")
public void compareGetParamsResponseBadCode201Test() {
    java.util.Map<java.lang.String, java.lang.String> params = new java.util.HashMap<>();
    params.put("userId", "6");
    com.coveros.selenified.services.Call call = this.calls.get();
    call.get("posts/", new com.coveros.selenified.services.Request(params), false).assertEquals(201);
    finish(1);
}