private java.util.Map<java.lang.String, java.lang.Object> getJson() throws java.lang.Exception {
    com.googlecode.utterlyidle.Application app = new com.utterlyswagger.example.example.ExampleApplication(new com.googlecode.utterlyidle.BasePath(""));
    com.googlecode.utterlyidle.Response handle = app.handle(com.googlecode.utterlyidle.RequestBuilder.get("/swagger/swagger_v2.json").build());
    java.lang.String jsonString = handle.entity().toString();
    return com.googlecode.funclate.json.Json.map(jsonString);
}