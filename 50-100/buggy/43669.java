@java.lang.Override
public org.modeshape.common.collection.Problems execute() {
    boolean includeBinaries = ((binaryDirectory.exists()) && (binaryDirectory.canRead())) && (options.includeBinaries());
    if (includeBinaries) {
        removeExistingBinaryFiles();
        restoreBinaryFiles();
    }
    processExistingDocuments();
    restoreDocuments(backupDirectory);
    restoreDocuments(changeDirectory);
    return problems;
}