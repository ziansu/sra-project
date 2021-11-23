private void onNewFile(java.lang.String fileName) {
    try {
        if (!(this.fileNamePatterns.keySet().contains(fileName))) {
            de.brockhaus.m2m.receiver.file.FileAdapter.LOG.info((fileName + " not of interest"));
            return ;
        }
        de.brockhaus.m2m.receiver.file.FileAdapter.LOG.info(("reading: " + fileName));
        this.fileReadHandler.handleFile(new java.io.File(this.fullFileName), FileEvent.FILE_READ, this);
    } catch (java.lang.Exception e) {
        de.brockhaus.m2m.receiver.file.FileAdapter.LOG.error(e);
    }
}