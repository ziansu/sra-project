private void closeTestPlan() throws java.io.IOException {
    if ((testPlanWriter) != null) {
        testPlanWriter.close();
        testPlanWriter = null;
    }
}