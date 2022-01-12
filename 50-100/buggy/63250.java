@java.lang.Override
public java.nio.file.FileVisitResult postVisitDirectory(java.nio.file.Path file, java.io.IOException exc) throws java.io.IOException {
    if (!(file.startsWith(project.getWorkPath()))) {
        @java.lang.SuppressWarnings(value = "unused")
        java.nio.file.WatchKey wk = file.register(watcher, java.nio.file.StandardWatchEventKinds.ENTRY_CREATE, java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY);
        com.bas.versions.utils.LogGenerator.log(("\t registered : " + (file.toFile().getAbsolutePath())));
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}