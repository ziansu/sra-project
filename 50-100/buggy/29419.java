private org.testng.ITestNGMethod[] resultsToMethods(java.util.List<org.testng.ITestResult> results) {
    org.testng.ITestNGMethod[] result = new org.testng.ITestNGMethod[results.size()];
    int i = 0;
    for (org.testng.ITestResult tr : results) {
        result[(i++)] = tr.getMethod();
    }
    return result;
}