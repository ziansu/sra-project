@org.junit.Test
public void getPersonality() throws java.lang.Exception {
    org.junit.Assert.assertNotNull(testNPC.getPersonality());
    org.junit.Assert.assertEquals(Personality.AGGRESSIVE, testNPC.getPersonality());
}