@org.junit.Test
public void delinkTeamFromExternalTeamOrphanExternalTeam() throws java.lang.Exception {
    io.restassured.RestAssured.given().header(org.springframework.http.HttpHeaders.CONTENT_TYPE, "application/json").header("name-id", "urn:collab:person:surfnet.nl:tdoe").body(new teams.domain.ExternalTeamProperties(2L, "urn:collab:group:example.org:name2")).when().put("api/teams/external-teams/delink").then().statusCode(org.apache.http.HttpStatus.SC_OK).body("externalTeams.size()", equalTo(0));
    org.junit.Assert.assertEquals(0, externalTeamRepository.findByTeamsUrn("nl:surfnet:diensten:giants").size());
}