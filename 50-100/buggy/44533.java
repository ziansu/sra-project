private static java.lang.String getExpectedOutput(java.lang.StackTraceElement testMethodStackTraceElem) {
    java.lang.String testMethodName = testMethodStackTraceElem.getMethodName();
    java.lang.String className = testMethodStackTraceElem.getClassName();
    java.lang.String expectedOutputFromFile = java2typescript.jackson.module.util.ExpectedOutputChecker.getFileContent(((((className.replace('.', '/')) + ".") + testMethodName) + ".d.ts"));
    expectedOutputFromFile = expectedOutputFromFile.replace("\r", "");
    return expectedOutputFromFile;
}