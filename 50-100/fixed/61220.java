private com.englishschool.controllers.TestProfile getProfile() {
    com.englishschool.controllers.TestProfile testProfile = new com.englishschool.controllers.TestProfile();
    java.util.List<java.lang.String> tests = new java.util.ArrayList<>();
    testProfile.setId("11111");
    com.englishschool.controllers.Test test = getTest();
    tests.add(test.getId());
    testProfile.setAvailableTests(tests);
    return testProfile;
}