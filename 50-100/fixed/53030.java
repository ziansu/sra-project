@org.testng.annotations.Test(groups = { "integration" , "services" , "httppost" , "virtual" }, description = "A negative integration test to verify the response code from a post call")
public void comparePostResponseBadCode200Test() {
    com.google.gson.JsonObject request = new com.google.gson.JsonObject();
    request.addProperty("title", "foo");
    request.addProperty("body", "bar");
    request.addProperty("userId", 2);
    com.coveros.selenified.services.Call call = this.calls.get();
    call.post("posts/", new com.coveros.selenified.services.Request(request)).assertEquals(200);
    finish(1);
}