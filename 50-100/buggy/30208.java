public void analyze() throws java.lang.Exception {
    if ((((files) == null) || ((detector) == null)) || ((issues) == null)) {
        throw new java.lang.IllegalStateException("Files, detector or issues must not be null");
    }
    com.ad.android.tools.lint.Lint.GenericLintDetectorTest genericLintDetectorTest = new com.ad.android.tools.lint.Lint.GenericLintDetectorTest(detector, java.util.Arrays.asList(issues));
    genericLintDetectorTest.analyze(files);
    warnings = genericLintDetectorTest.getWarnings();
}