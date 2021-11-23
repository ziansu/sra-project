@java.lang.Override
public java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path dir, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    if (!(dir.startsWith("SuperBackup"))) {
        java.lang.System.out.println(dir);
        dir.register(watcher, java.nio.file.StandardWatchEventKinds.ENTRY_CREATE, java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY, java.nio.file.StandardWatchEventKinds.ENTRY_DELETE);
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}