@org.testng.annotations.Test(groups = { "integration" , "services" , "httppatch" , "virtual" }, description = "A negative integration test to verify the response code from a patch call")
public void comparePatchResponseBadCode201Test() {
    com.google.gson.JsonObject request = new com.google.gson.JsonObject();
    request.addProperty("id", 1);
    request.addProperty("title", "foo1");
    request.addProperty("body", "bar");
    request.addProperty("userId", 4);
    com.coveros.selenified.services.Call call = this.calls.get();
    call.patch("posts/4", new com.coveros.selenified.services.Request(request)).assertEquals(201);
    finish(1);
}