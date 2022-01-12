private void setUpFormatsAndDatabaseWriter() {
    formats = loadAllFormats();
    for (final uk.gov.nationalarchives.droid.profile.referencedata.Format format : formats) {
        puidFormatMap.put(format.getPuid(), format);
    }
    nodeIds = new java.util.concurrent.atomic.AtomicLong(((getMaxNodeId()) + 1));
    if (((formats.size()) > 0) && ((this.writer) == null)) {
        createAndRunDatabaseWriterThread();
    }
}