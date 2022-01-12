private void prepareOutputDir(final java.io.File outputDir) throws java.io.IOException {
    if (outputDir.exists()) {
        if (outputDir.isFile()) {
            throw new java.io.IOException((("Invalid output directory '" + outputDir) + "' that exists but is a file"));
        }
        if (!(outputDir.canWrite())) {
            throw new java.io.IOException((("Invalid output directory '" + outputDir) + "' that cannot be written to"));
        }
    }else {
        outputDir.mkdirs();
    }
}