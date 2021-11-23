@java.lang.Override
public void ioOperationOneFileProcessed(core.Property property) {
    java.lang.System.out.println(property.getTotalBackupedSrcFiles());
    java.lang.System.out.println(property.getTotalSrcFiles());
    double ratio = ((double) (property.getTotalBackupedSrcFiles())) / ((double) (property.getTotalSrcFiles()));
    java.lang.System.out.println(((int) (ratio * 100.0)));
    java.lang.System.out.println("---------------------------------------------------");
    _progressBar.setValue(((int) (ratio * 100.0)));
}