@org.junit.Test
public void linkedTeams() throws java.lang.Exception {
    io.restassured.RestAssured.given().header(org.springframework.http.HttpHeaders.CONTENT_TYPE, "application/json").header("name-id", "urn:collab:person:surfnet.nl:jdoe").when().get("api/teams/external-teams/linked-teams").then().statusCode(org.apache.http.HttpStatus.SC_OK).body("'urn:collab:group:example.org:name1'.name", hasItems("riders")).body("'urn:collab:group:example.org:name2'.name", hasItems("riders", "giants"));
}