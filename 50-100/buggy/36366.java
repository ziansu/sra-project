@java.lang.Override
public boolean next() throws net.sf.jasperreports.engine.JRException {
    fieldCache.clear();
    itemCache.clear();
    (index)++;
    boolean hasRecord = (index) < (block.getBlockRecordCount());
    if (hasRecord) {
        block.navigateToNextRecord();
    }
    if (!hasRecord) {
        index = -1;
    }
    return hasRecord;
}