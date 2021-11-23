@org.junit.Test
public void testUserIdOnlyCase() {
    java.lang.String testToken = testUserId;
    org.sagebionetworks.web.client.place.Profile place = tokenizer.getPlace(testToken);
    assertEquals(testUserId, place.getUserId());
    assertEquals(Synapse.ProfileArea.PROJECTS, place.getArea());
    assertEquals(testToken, tokenizer.getToken(place));
}