@javax.annotation.CheckForNull
private org.sonar.api.batch.fs.InputFile getInputFile(org.jacoco.core.analysis.ISourceFileCoverage coverage) {
    java.lang.String path = org.sonar.plugins.groovy.jacoco.AbstractAnalyzer.getFileRelativePath(coverage);
    org.sonar.api.batch.fs.InputFile sourceInputFileFromRelativePath = groovyFileSystem.sourceInputFileFromRelativePath(path);
    if (sourceInputFileFromRelativePath == null) {
        org.sonar.plugins.groovy.jacoco.JaCoCoExtensions.logger().warn(("File not found: " + path));
    }
    return sourceInputFileFromRelativePath;
}