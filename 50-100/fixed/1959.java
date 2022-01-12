private java.io.File getOutputFile(java.lang.String className, java.lang.String methodName, java.lang.String fileExtension) throws java.io.IOException {
    java.io.File outputDir = new java.io.File((((screenshotDirectory) + "/") + (createSubdirectoryForTestCase ? className : "")));
    outputDir.mkdirs();
    return new java.io.File(outputDir, (((className + "-") + methodName) + fileExtension));
}