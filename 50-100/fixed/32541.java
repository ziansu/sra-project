private void createNewTestPlan() throws java.io.IOException {
    if ((testPlanWriter) == null) {
        testPlanCount += 1;
        java.nio.file.Path testPlanPath = testPlanDirectory.resolve((("TestPlan-" + (testPlanCount)) + ".json"));
        testPlanWriter = new java.io.BufferedWriter(new java.io.FileWriter(testPlanPath.toFile(), true));
    }
}