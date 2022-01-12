public int createIssue(bugify.model.Issue issue) throws java.io.IOException {
    java.lang.String json = com.jayway.restassured.RestAssured.given().parameter("subject", issue.getSubject()).parameter("description", issue.getDescription()).post(app.getProperty(((bugify.appmanager.consts.AppConsts.REST_URL_PROP) + "/issues.json"))).asString();
    com.google.gson.JsonElement parsed = new com.google.gson.JsonParser().parse(json);
    return parsed.getAsJsonObject().get("issue_id").getAsInt();
}