public static void removeFile(java.lang.String file) {
    if (!(elegit.ConflictingFileWatcher.watching)) {
        elegit.ConflictingFileWatcher.conflictingThenModifiedFiles.remove(file);
    }
}