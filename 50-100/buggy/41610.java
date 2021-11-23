private java.lang.String solveTestCases(java.io.BufferedReader br) throws java.io.IOException {
    java.lang.StringBuilder sbOutput = new java.lang.StringBuilder();
    int testCaseCount = java.lang.Integer.parseInt(br.readLine());
    for (int testCase = 1; testCase <= testCaseCount; testCase++) {
        sbOutput.append(java.lang.String.format("Case #%d: %s\n", testCase, solveTestCase(br)));
    }
    return sbOutput.toString().trim();
}