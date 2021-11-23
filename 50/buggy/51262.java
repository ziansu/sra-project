public void testName() {
    com.csahmad.moodcloud.Profile profile = new com.csahmad.moodcloud.Profile("test");
    profile.setName("new");
    assertEquals("new", profile.getName());
}