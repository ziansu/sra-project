@java.lang.Override
public void ioOperationOneFileProcessed(core.Property property) {
    double ratio = ((double) (property.getTotalBackupedSrcFiles())) / ((double) (property.getTotalSrcFiles()));
    _progressBar.setValue(((int) (ratio * 100.0)));
}