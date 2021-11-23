public void analyze() throws java.lang.Exception {
    if ((((files) == null) || ((detector) == null)) || ((issues) == null)) {
        throw new java.lang.IllegalStateException("Files, detector or issues must not be null");
    }
    genericLintDetectorTest.analyze(detector, java.util.Arrays.asList(issues), files);
    warnings = genericLintDetectorTest.getWarnings();
}