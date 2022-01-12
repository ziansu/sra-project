@java.lang.Override
public int compare(ninja.eivind.hotsreplayuploader.models.ReplayFile o1, ninja.eivind.hotsreplayuploader.models.ReplayFile o2) {
    if (o1 == o2) {
        return 0;
    }
    final java.io.File file1 = o1.getFile();
    final java.io.File file2 = o2.getFile();
    return -(java.lang.Long.compare(file1.lastModified(), file2.lastModified()));
}