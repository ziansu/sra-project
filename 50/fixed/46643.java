public hudson.FilePath getWorkspaceFilePath(java.lang.String fileName) {
    return new hudson.FilePath(build.getWorkspace(), fileName);
}