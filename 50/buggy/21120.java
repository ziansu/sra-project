io.jmnarloch.cd.go.plugin.gradle.GradleTaskConfigParser withWorkingDirectory(java.lang.String workingDirectory) {
    this.workingDirectory = workingDirectory.replace("\\", java.io.File.separator);
    return this;
}