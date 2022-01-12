@org.junit.Test
public void testChallengesCase() {
    java.lang.String testToken = (testUserId) + (org.sagebionetworks.web.client.place.Profile.CHALLENGES_DELIMITER);
    org.sagebionetworks.web.client.place.Profile place = tokenizer.getPlace(testToken);
    org.junit.Assert.assertEquals(testUserId, place.getUserId());
    org.junit.Assert.assertEquals(Synapse.ProfileArea.CHALLENGES, place.getArea());
    org.junit.Assert.assertEquals(testToken, tokenizer.getToken(place));
}