public static void removeFile(java.lang.String file) {
    if ((elegit.ConflictingFileWatcher.watching) == 0) {
        elegit.ConflictingFileWatcher.conflictingThenModifiedFiles.remove(file);
    }
}