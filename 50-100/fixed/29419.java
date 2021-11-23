private static java.util.List<org.testng.ITestNGMethod> resultsToMethods(java.util.List<org.testng.ITestResult> results) {
    java.util.List<org.testng.ITestNGMethod> result = new java.util.ArrayList(results.size());
    for (org.testng.ITestResult tr : results) {
        result.add(tr.getMethod());
    }
    return result;
}