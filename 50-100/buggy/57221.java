protected void undoStoreValue(org.exist.storage.index.StoreValueLoggable loggable) {
    try {
        final org.exist.storage.index.BFile.SinglePage page = ((org.exist.storage.index.BFile.SinglePage) (getDataPage(loggable.page)));
        removeValueHelper(null, loggable.tid, page);
    } catch (final java.io.IOException e) {
        org.exist.storage.index.LOG.warn(("An IOException occurred during redo: " + (e.getMessage())), e);
    }
}