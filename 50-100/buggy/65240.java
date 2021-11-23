@java.lang.Override
public int compare(ninja.eivind.hotsreplayuploader.models.ReplayFile o1, ninja.eivind.hotsreplayuploader.models.ReplayFile o2) {
    if (o1 == o2) {
        return 0;
    }
    final java.io.File file1 = o1.getFile();
    final java.io.File file2 = o2.getFile();
    final int modified = -(java.lang.Long.compare(file1.lastModified(), file2.lastModified()));
    if (modified != 0) {
        return modified;
    }
    throw new java.lang.IllegalStateException("No two different replays can be equal.");
}