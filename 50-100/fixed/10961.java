@org.testng.annotations.Test(groups = { "integration" , "services" , "httpdelete" , "virtual" }, description = "A negative integration test to verify the response code from a delete call")
public void compareDeleteResponseBadCode201Test() {
    com.google.gson.JsonObject request = new com.google.gson.JsonObject();
    request.addProperty("id", 1);
    request.addProperty("title", "foo1");
    request.addProperty("body", "bar");
    request.addProperty("userId", 5);
    com.coveros.selenified.services.Call call = this.calls.get();
    call.delete("posts/5", new com.coveros.selenified.services.Request(request)).assertEquals(201);
    finish(1);
}