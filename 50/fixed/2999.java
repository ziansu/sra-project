public void testGetFollower() {
    com.csahmad.moodcloud.Profile profile1 = new com.csahmad.moodcloud.Profile("test");
    com.csahmad.moodcloud.Profile profile2 = new com.csahmad.moodcloud.Profile("test2");
    profile1.addFollower(profile2);
    assertEquals(profile2, profile1.getFollower(0));
}