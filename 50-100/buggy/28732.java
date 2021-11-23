@org.junit.Test
public void delinkTeamFromExternalTeam() throws java.lang.Exception {
    io.restassured.RestAssured.given().header(org.springframework.http.HttpHeaders.CONTENT_TYPE, "application/json").header("name-id", "urn:collab:person:surfnet.nl:jdoe").body(new teams.domain.ExternalTeamProperties(1L, "urn:collab:group:example.org:name2")).when().put("api/teams/external-teams/delink").then().statusCode(org.apache.http.HttpStatus.SC_OK).body("externalTeams.size()", org.hamcrest.Matchers.equalTo(1));
    org.junit.Assert.assertEquals(1, externalTeamRepository.findByTeamsUrn("nl:surfnet:diensten:riders").size());
}