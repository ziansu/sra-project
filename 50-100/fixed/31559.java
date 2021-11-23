@org.junit.Test
public void testChallengesCase() {
    java.lang.String testToken = (testUserId) + (org.sagebionetworks.web.client.place.Profile.CHALLENGES_DELIMITER);
    org.sagebionetworks.web.client.place.Profile place = tokenizer.getPlace(testToken);
    assertEquals(testUserId, place.getUserId());
    assertEquals(Synapse.ProfileArea.CHALLENGES, place.getArea());
    assertEquals(testToken, tokenizer.getToken(place));
}