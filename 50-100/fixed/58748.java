@java.lang.Override
public boolean next() throws net.sf.jasperreports.engine.JRException {
    fieldCache.clear();
    sitemCache.clear();
    vCache.clear();
    svCache.clear();
    focusedRecord = null;
    boolean navigateToNextRecord = block.navigateToNextRecord();
    if (navigateToNextRecord) {
        focusedRecord = block.getCurrentRecord();
    }
    if ((!navigateToNextRecord) && (block.isControlBlock())) {
        block.reset();
    }
    return navigateToNextRecord;
}