private boolean testingThisTest(org.junit.runner.Description description) {
    return ((description.getTestClass()) != null) && (description.getTestClass().equals(testClass));
}