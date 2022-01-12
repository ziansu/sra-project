@java.lang.Override
protected org.locationtech.geogig.repository.Repository _call() {
    final org.locationtech.geogig.api.Platform platform = platform();
    final java.io.File workingDirectory = platform.pwd();
    com.google.common.base.Preconditions.checkState((workingDirectory != null), "working directory is null");
    final java.io.File targetDir = ((this.targetDir) == null) ? workingDirectory : this.targetDir;
    org.locationtech.geogig.repository.Repository repository;
    try {
        repository = callInternal(targetDir);
    } finally {
        platform.setWorkingDir(workingDirectory);
    }
    return repository;
}